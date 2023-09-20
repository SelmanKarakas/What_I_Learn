package com.cydeo.entity;

import com.cydeo.enums.MovieState;
import com.cydeo.enums.MovieType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.stream.Location;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Movie extends BaseEntity {

    private String name;

    @Column(columnDefinition = "DATE")
    private LocalDate releaseDate;
    private Integer duration;

    @Column(columnDefinition = "text")
    private String summary;

    @Enumerated(EnumType.STRING)
    private MovieType type;

    @Enumerated(EnumType.STRING)
    private MovieState state;

    private BigDecimal price;

    @ManyToMany
    @JoinTable(name = "movie_genre_re",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private List<Genre> genreList;

}

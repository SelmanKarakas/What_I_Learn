package com.cydeo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

   // @NotNull // field shouldn't be null
    //@NotBlank // field shouldn't be ""
    //@NotEmpty // field shouldn't be "        "

    //    @NotNull -> @NotNull
//    @NotEmpty -> @NotNull + @NotEmpty
//    @NotBlank -> @NotNull + @NotEmpty + @NotBlank

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;

    //    @NotBlank
//    @Size(max = 12, min = 2)
    private String lastName;

    // Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts mm-dd-yyyy  -   yyyy-dd-mm

    //    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    //    @NotBlank
//    @Email
    private String email;

    //    @NotBlank
//    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}

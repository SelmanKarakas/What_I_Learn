package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "regions")
@NoArgsConstructor
public class Region extends BaseEntity{

    private String region;
    private String country;


}

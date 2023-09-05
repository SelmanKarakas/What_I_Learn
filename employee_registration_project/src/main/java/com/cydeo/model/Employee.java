package com.cydeo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

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


    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;

    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}

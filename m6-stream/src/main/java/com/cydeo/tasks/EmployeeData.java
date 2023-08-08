package com.cydeo.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(101,"Selman","selmankarakas1@gmail.com", Arrays.asList("05522555531,05302271506")),
                new Employee(100,"Ozzy","ozzy@cydeo.com", Arrays.asList("05522531,05241231")),
                new Employee(102,"Peter","peter@gmail.com", Arrays.asList("051123531,0525213231"))
                );

    }

}

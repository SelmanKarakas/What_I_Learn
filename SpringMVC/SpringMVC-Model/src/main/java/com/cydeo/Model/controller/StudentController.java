package com.cydeo.Model.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(){
        String name = "Ozzy";

    }

}

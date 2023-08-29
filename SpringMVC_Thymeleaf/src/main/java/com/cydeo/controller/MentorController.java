package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @RequestMapping("/register")
    public String register(){

        return "student/register";
    }

    @RequestMapping("/drop")
    public String drop(){

        return "student/register";
    }
}

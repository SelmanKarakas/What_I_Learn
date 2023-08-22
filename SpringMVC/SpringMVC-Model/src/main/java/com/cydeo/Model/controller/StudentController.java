package com.cydeo.Model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

        String subject = "Spring Boot";
        model.addAttribute("subject",subject);

        int studentId = new Random().nextInt();
        model.addAttribute("id",studentId);

        return "student/welcome";
    }

}

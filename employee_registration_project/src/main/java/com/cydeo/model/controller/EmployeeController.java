package com.cydeo.model.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employee")
@Controller
public class EmployeeController {

    @GetMapping("register")
    public String createEmployee(){
        return "employee/employee_create";
    }

}

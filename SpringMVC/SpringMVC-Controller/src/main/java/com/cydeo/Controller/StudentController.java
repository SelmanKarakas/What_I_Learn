package com.cydeo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/student")
    public String getStudentInfo(){
        return "static/student/welcome.html";
    }

}

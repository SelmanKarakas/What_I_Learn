package com.cydeo.controller;

import com.cydeo.Enum.Gender;
import com.cydeo.Model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Selman","Karakas",18, Gender.MALE));
        mentorList.add(new Mentor("Sıla","Karakaş",19, Gender.FEMALE));
        mentorList.add(new Mentor("Ammy","Bryan",25, Gender.FEMALE));

        model.addAttribute("mentors",mentorList);

        return "mentor/mentor-list";
    }

}

package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/classes")
    public String classesPage(){
        return "classes";
    }

    @RequestMapping("/student")
    public String StudentPage(){
        return "student";
    }
}

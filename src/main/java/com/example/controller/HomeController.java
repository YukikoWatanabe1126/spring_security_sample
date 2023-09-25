package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHome() {
        return "home";
    }
    
    @GetMapping("/admin")
    public String adminPage() {
        return "admin/index";
    }
}

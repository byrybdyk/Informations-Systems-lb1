package com.byrybdyk.lb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/user/home")
    public String userHome() {
        return "user-home";
    }

    @GetMapping("/admin/home")
    public String adminHome() {
        return "admin-home";
    }
}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
}
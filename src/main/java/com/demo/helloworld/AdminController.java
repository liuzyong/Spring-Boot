package com.demo.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("projectName", "MOXI");
        return "login.html";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("projectName", "MOXI");
        return "register";
    }

}
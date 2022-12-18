package com.dnekh.demothymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CatController {

    @GetMapping("/home")
    public String getCat(Model model) {
        model.addAttribute("hello", "Hello Kitty Super Mors!");
        return "index";
    }
}

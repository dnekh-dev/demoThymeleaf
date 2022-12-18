package com.dnekh.demothymeleaf.controllers;

import com.dnekh.demothymeleaf.models.CatModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class CatController {

    @GetMapping("/home")
    public String getCat(Model model) {
        model.addAttribute("hello", "Hello Kitty Super Mors!");
        model.addAttribute("cat", Arrays.asList(
                new CatModel("Mors", 7),
                new CatModel("Boris", 5),
                new CatModel("Lucy", 6)
        ));
        return "index";
    }
}

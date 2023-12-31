package com.example.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping
    public String condiment(@RequestParam(value = "condiment", required = false) String[] condiment, Model model) {
        model.addAttribute("result", Arrays.toString(condiment));
        return "index";
    }
}

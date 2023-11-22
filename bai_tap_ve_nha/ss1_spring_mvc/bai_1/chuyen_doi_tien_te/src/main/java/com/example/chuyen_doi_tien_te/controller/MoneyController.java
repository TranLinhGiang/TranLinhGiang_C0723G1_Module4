package com.example.chuyen_doi_tien_te.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class MoneyController {
    @GetMapping("/home")
    public String showHome() {
        return ("/home");
    }

    @PostMapping("/tinh")
    public String result(@RequestParam double rate, Model model){
        double result= rate*23000;
        model.addAttribute("result", result);
        return "/home";
    }
}

package com.example.may_tinh_ca_nhan.controller;

import com.example.may_tinh_ca_nhan.repository.ICalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class CalculatorController {
    @Autowired
    private ICalculatorRepository repository;

    @GetMapping("/index")
    public String home() {
        return "/index";
    }

    @PostMapping("/tinh")
    public String tinh(@RequestParam("calculator") String calculator,
                       @RequestParam("num1") double num1,
                       @RequestParam("num2") double num2, Model model) {
    model.addAttribute("result",repository.calculator(calculator, num1, num2));
        return "/index";
    }
}

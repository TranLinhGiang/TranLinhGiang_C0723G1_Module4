package com.example.calculator.controller;

import com.example.calculator.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping(value = "/index")
    public String showForm() {
        return "/index";
    }

    @PostMapping("/calculator")
    public String calculator(@RequestParam("calculator") String calculator,
                             @RequestParam("num1") double num1,
                             @RequestParam("num2") double num2, Model model) {
        model.addAttribute("result", iCalculatorService.calculator(calculator,num1,num2));
        return "/index";
    }
}

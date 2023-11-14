package com.example.currencyconversion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class CurrencyConversionController {
    @GetMapping ()
    public ModelAndView showForm(){
        return new ModelAndView("/list");
    }
    @GetMapping("/submit")
    public ModelAndView convert (@RequestParam int vnd){
        System.out.println(vnd);
        double usd= vnd/23000;
        return  new ModelAndView("/list","usd",usd);
    }
}

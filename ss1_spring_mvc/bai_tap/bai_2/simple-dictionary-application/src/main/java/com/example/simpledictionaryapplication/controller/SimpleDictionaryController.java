package com.example.simpledictionaryapplication.controller;

import com.example.simpledictionaryapplication.service.ISimpleDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleDictionaryController {
    @Autowired
    private ISimpleDictionaryService iSimpleDictionaryService;
    @GetMapping(value = "/index")
    public String showForm(){
        return "/index";
    }
    @PostMapping("/index")
    public String search(@RequestParam String word, Model model){
        String words = iSimpleDictionaryService.getDictionary().get(word);
        model.addAttribute("list", words);
        return "/index";
    }

}

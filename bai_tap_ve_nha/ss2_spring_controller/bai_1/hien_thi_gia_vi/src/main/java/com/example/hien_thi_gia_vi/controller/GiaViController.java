package com.example.hien_thi_gia_vi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
@RequestMapping("")
public class GiaViController {
    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @PostMapping("/save")
    public String save(@RequestParam(value = "save", required = false) String[] save, Model model) {
        model.addAttribute("result", Arrays.toString(save));
        return "/home";
    }
}

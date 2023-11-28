package com.example.fishmanagement.controller;

import com.example.fishmanagement.model.User;

import com.example.fishmanagement.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String showForm(Model model) {
        List<User> userList=userService.findAll();
        model.addAttribute("userList", userList);
        return "/home";
    }

//    @GetMapping("/create")
//    public String save(Model model){
//        model.addAttribute("category",categoryService.findAll() );
//        model.addAttribute("blog",new User());
//        return "/home";
//    }
//    @PostMapping("/add")
//    public String save(@ModelAttribute User user, RedirectAttributes attributes){
//        userService.save(user);
//        attributes.addAttribute("mess", "Add blog success !");
//        return "redirect:/home";
//    }
}

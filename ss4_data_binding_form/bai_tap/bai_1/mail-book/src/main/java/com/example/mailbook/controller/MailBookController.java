package com.example.mailbook.controller;

import com.example.mailbook.model.MailBook;
import com.example.mailbook.service.MailBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MailBookController {
    @Autowired
   private MailBookService mailBookService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("mailBook", mailBookService.getMailBook());
        model.addAttribute("languageList",new String[]{"java","python","c#","PHP"});
        model.addAttribute("sizeList", new String[]{"5","10","15","25","50","100"});
        return "/index";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute MailBook mailBook, Model model){
        mailBookService.update(mailBook);
        model.addAttribute("mailBook", mailBookService.getMailBook());
        return "/update";
    }
}
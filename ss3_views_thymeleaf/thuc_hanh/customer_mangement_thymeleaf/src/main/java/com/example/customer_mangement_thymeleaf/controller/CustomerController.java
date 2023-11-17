package com.example.customer_mangement_thymeleaf.controller;

import com.example.customer_mangement_thymeleaf.model.Customer;
import com.example.customer_mangement_thymeleaf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private final CustomerService customerService= new CustomerService();
    @GetMapping("")
    public String index(Model model){
        List<Customer>customerList= customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }

}

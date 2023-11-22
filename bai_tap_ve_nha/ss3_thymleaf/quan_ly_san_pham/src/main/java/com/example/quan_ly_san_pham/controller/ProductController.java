package com.example.quan_ly_san_pham.controller;

import com.example.quan_ly_san_pham.model.Product;
import com.example.quan_ly_san_pham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/home")
    public String home(Model model) {
        List<Product> products = productService.getProduct();
        model.addAttribute("product", products);
        return "/home";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model) {
        Product product= productService.getProduct().get(id);
        model.addAttribute("productEdit",product);
        return "/edit";
    }
    @PostMapping("/editProduct")
    public String edit(Product product){
     productService.updateProduct(product.getId(), product);
     return "redirect:/home";
    }
    @GetMapping("/delete")
    public String remove(@RequestParam int id, Model model){
        model.addAttribute("product",productService.findById(id));
        return "/delete";
    }
    @PostMapping("/deletePr")
    public String remove(Product product){
        productService.remove(product.getId());
        return "redirect:/home";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return ("/detail");
    }
}

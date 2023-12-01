package com.example.productmanagemnet.controller;

import com.example.productmanagemnet.model.Product;
import com.example.productmanagemnet.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    
    @GetMapping("")
    public String home(Model model){
        List<Product> productList= productService.findAll();
        model.addAttribute("product", productList);
        return "/product/home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("productCreate", new Product());
        return "/product/create";
    }

    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model model){
        Product product= productService.findById(id);
        model.addAttribute("editProduct",product);
        return  "/product/edit";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return ("/product/detail");
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id, Model model){
        model.addAttribute("products", productService.findById(id));
        return "/product/delete";
    }
    @GetMapping ("/search")
    public String search(@RequestParam String name, Model model){
        List<Product>products= productService.searchName(name);
        model.addAttribute("product",products);
        return "/home";
    }

    @PostMapping("/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/";
    }

    @PostMapping("/editPr")
    public String edit(Product product){
        productService.update(product);
        return "redirect:/";
    }
    @PostMapping("/deletePr")
    public String delete(Product product) {
        productService.remove(product.getId());
        return "redirect:/";
    }
}

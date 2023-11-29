package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.Cart;
import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setupCart() {
        return new Cart();
    }

    @GetMapping
    public String showShop(Model model) {
        List<Product> carts = productService.findAll();
        model.addAttribute("carts", carts);
        return "/shop";
    }

    @GetMapping("/detail")
    public String showFormDetail(@RequestParam Long id, Model model) {
        model.addAttribute("detail", productService.findById(id));

        return "/detail";
    }

    @GetMapping("/add")
    public String addToCart(@RequestParam Long id,
                            @ModelAttribute Cart cart,
                            @RequestParam("action") String action) {
        Product productOptional = productService.findById(id);
        if (productOptional == null) {
            return "/error_404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional);
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteToCart(@RequestParam Long id,
                               @ModelAttribute Cart cart,
                               @RequestParam("action") String action) {
        Product productOptional = productService.findById(id);
        if (productOptional == null) {
            return "/error_404";
        }
        if (action.equals("show")) {
            cart.deleteProduct(productOptional);
            return "redirect:/shopping-cart";
        }
        cart.deleteProduct(productOptional);
        return "redirect:/";
    }
    @GetMapping("/hihi")
    public String showHihi(){
        return "/hihi";
    }
}
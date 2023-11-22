package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @GetMapping("/home")
    public String home(Model model){
        List<Blog>blogList= blogService.findAll();
        model.addAttribute("blogList",blogList);
        return "/home";
    }
   @GetMapping("/create")
    public String save(Model model){
        model.addAttribute("blog",new Blog());
        return "/create";
   }
   @PostMapping("/add")
    public String save(Blog blog){
        blogService.save(blog);
        return "redirect:/home";
   }
   @GetMapping("/update")
    public String update(@RequestParam int id, Model model){
        model.addAttribute("updateBl",blogService.finById(id));
        return "/update";
   }
   @PostMapping("/update")
    public String update(Blog blog) {
        blogService.update(blog);
        return "redirect:/home";
   }
   @GetMapping("/delete")
    public String delete(@RequestParam int id,Model model){
        model.addAttribute("deleteBlog",blogService.finById(id));
        return "/delete";
   }
   @PostMapping("/delete")
    public String delete(Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/home";
   }
   @GetMapping("/detail")
    public String detail(@RequestParam int id,Model model){
        model.addAttribute("blog",blogService.finById(id));
        return "/detail";
   }
}

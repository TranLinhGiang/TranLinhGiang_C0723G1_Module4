package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.service.IBlogService;
import com.example.blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping()
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/home")
    public String home(
            @RequestParam(required = false) String mess,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "") String searchName,
            @RequestParam(required = false) String categoryId,
            Model model
    ){
        Pageable pageable = PageRequest.of(page,4, Sort.by("name").ascending().and(Sort.by("poster").descending()));
        Page<Blog> blogPage= blogService.findAll(searchName,pageable, categoryId);
        model.addAttribute("blogPage",blogPage);
        model.addAttribute("searchName",searchName);
        model.addAttribute("mess", mess);
        model.addAttribute("selectedCategory", categoryId);
        return "/blog/home";
    }
    @GetMapping("/create")
    public String save(Model model){
        model.addAttribute("category",categoryService.findAll() );
        model.addAttribute("blog",new Blog());
        return "/blog/create";
    }
    @PostMapping("/add")
    public String save(@ModelAttribute Blog blog, RedirectAttributes attributes){
        blogService.save(blog);
        attributes.addAttribute("mess", "Add blog success !");
        return "redirect:/home";
    }
    @GetMapping("/update")
    public String update(@RequestParam int id, Model model){
        model.addAttribute("updateBl",blogService.finById(id));
        return "/blog/update";
    }
    @PostMapping("/update")
    public String update(Blog blog, RedirectAttributes attributes) {
        blogService.update(blog);
        attributes.addAttribute("mess", "update thành công");
        return "redirect:/home";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id,Model model){
        model.addAttribute("deleteBlog",blogService.finById(id));
        return "/blog/delete";
    }
    @PostMapping("/delete")
    public String delete(Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/home";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam int id,Model model){
        model.addAttribute("blog",blogService.finById(id));
        return "/blog/detail";
    }
}
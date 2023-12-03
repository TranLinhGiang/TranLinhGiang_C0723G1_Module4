package com.example.viet_api.controller;

import com.example.viet_api.model.Blog;
import com.example.viet_api.service.IBlogService;
import com.example.viet_api.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String showHome(Model model,
                           @RequestParam(required = false) String mess
    ) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList", blogList);
        model.addAttribute("mess", mess);
        return "/home";
    }


    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("category", categoryService.findAll());
        return "/create";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.add(blog);
        redirectAttributes.addAttribute("mess", "Thêm mới thành công");
        return "redirect:/";
    }

    @GetMapping("/update")
    public String showFormUpdate(@RequestParam int id, Model model) {
        model.addAttribute("updateBlog", blogService.findById(id));
        model.addAttribute("category", categoryService.findAll());
        return "/update";
    }

    @PostMapping("/updateBlog")
    public String update(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.update(blog);
        redirectAttributes.addAttribute("mess","Chỉnh sửa thành công");
        return ("redirect:/");
    }

    @GetMapping("/detail")
    public String showDetail(@RequestParam int id, Model model) {
        model.addAttribute("detailBlog", blogService.findById(id));
        return "/detail";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirectAttributes) {
        blogService.remove(id);
        redirectAttributes.addAttribute("mess","Xóa thành công");
        return "redirect:/";
    }
}

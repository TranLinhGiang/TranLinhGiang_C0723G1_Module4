package com.example.blog_api.controller;

import com.example.blog_api.dto.BlogDto;
import com.example.blog_api.model.Blog;
import com.example.blog_api.model.Category;
import com.example.blog_api.service.IBlogService;
import com.example.blog_api.service.ICategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api-blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<List<Blog>> getList() {
        List<Blog> blogList = blogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK); // 200
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> showListCategories(@RequestParam(defaultValue = "0") int page,
                                                             @RequestParam(defaultValue = "") String searchName,
                                                             Model model) {
        List<Category> categoryPage = categoryService.findAll();
        if (categoryPage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categoryPage, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Blog> blogDetail(@PathVariable int id){
        try {
            Blog blog = blogService.showDetail(id);
            return new ResponseEntity<>(blog,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @GetMapping("/detailCategory/{id}")
    public ResponseEntity<Category> categoryDetail(@PathVariable int id){
        try {
            Category category = categoryService.finById(id);
            return new ResponseEntity<>(category,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}

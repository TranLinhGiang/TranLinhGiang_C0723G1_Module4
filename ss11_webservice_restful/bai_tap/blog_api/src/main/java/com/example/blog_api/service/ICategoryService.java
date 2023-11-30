package com.example.blog_api.service;

import com.example.blog_api.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category finById(int id);
}

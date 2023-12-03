package com.example.viet_api.service;

import com.example.viet_api.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findById(int id);
}

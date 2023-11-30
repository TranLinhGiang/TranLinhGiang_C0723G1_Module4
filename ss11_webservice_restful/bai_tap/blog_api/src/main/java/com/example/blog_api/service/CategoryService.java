package com.example.blog_api.service;

import com.example.blog_api.model.Category;
import com.example.blog_api.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category finById(int id) {
        return categoryRepository.findById(id).get();
    }
}

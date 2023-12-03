package com.example.viet_api.service;

import com.example.viet_api.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void add(Blog blog);

    void remove(int id);

    void update(Blog blog);

}

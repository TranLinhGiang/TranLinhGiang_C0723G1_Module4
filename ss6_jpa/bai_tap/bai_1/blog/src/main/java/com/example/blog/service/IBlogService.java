package com.example.blog.service;

import com.example.blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void update(Blog blog);

    Blog finById(int id);

    void remove(int id);

}

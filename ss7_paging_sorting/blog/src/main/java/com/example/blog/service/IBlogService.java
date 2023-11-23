package com.example.blog.service;

import com.example.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(String search, Pageable pageable);

    void save(Blog blog);

    void update(Blog blog);

    Blog finById(int id);

    void remove(int id);

}

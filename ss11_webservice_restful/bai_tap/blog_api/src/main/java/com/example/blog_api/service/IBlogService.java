package com.example.blog_api.service;

import com.example.blog_api.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void update(Blog blog);

    Blog finById(int id);

    void remove(int id);

    Blog showDetail(int id);
}

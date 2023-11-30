package com.example.blog_api.service;

import com.example.blog_api.model.Blog;
import com.example.blog_api.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;


    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {

    }

    @Override
    public void update(Blog blog) {

    }

    @Override
    public Blog finById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Blog showDetail(int id) {
        return blogRepository.findById(id).get();
    }
}

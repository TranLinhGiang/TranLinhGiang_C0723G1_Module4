package com.example.blog.service;

import com.example.blog.model.Blog;
import com.example.blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public Page<Blog> findAll(String searchName, Pageable pageable, String category) {
        if (category != null && category != "") {

            int categoryId = Integer.parseInt(category);

            return blogRepository.searchWithCategory(categoryId, pageable);
        }

        return blogRepository.search("%"+searchName+"%", pageable);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog finById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }


}

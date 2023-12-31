package com.example.blog_api.repository;

import com.example.blog_api.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from  blog where  name like :searchName", nativeQuery = true)
    Page<Blog> search(@Param("searchName") String name, Pageable pageable);

    @Query(value = "select * from  blog  where  category_id = :category_id", nativeQuery = true)
    Page<Blog> searchWithCategory(@Param("category_id") int categoryId, Pageable pageable);
}

package com.example.bookborrowingapplication.repository;

import com.example.bookborrowingapplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}

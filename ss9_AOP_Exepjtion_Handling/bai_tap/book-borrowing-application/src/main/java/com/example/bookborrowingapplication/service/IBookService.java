package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findByID(int id);

    void updateBook(Book book);
}

package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.model.Book;
import com.example.bookborrowingapplication.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findByID(int id) {
        return bookRepository.findById(id).get();
    }


    @Override
    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}

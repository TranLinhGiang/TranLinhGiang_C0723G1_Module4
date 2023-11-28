package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.model.BorrowedCode;
import com.example.bookborrowingapplication.repository.IBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowBooksService implements IBorrowBooksService{
    @Autowired
    private IBorrowRepository borrowRepository;

    @Override
    public void createBorrow(BorrowedCode borrowedCode) {
        borrowRepository.save(borrowedCode);
    }

    @Override
    public BorrowedCode checkBorrowedCode(int code) {
        return borrowRepository.checkBorrowedCode(code);
    }

    @Override
    public List<BorrowedCode> displayAllCode() {
        return borrowRepository.findAll();
    }
}

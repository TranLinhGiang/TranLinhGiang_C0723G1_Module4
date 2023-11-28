package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.model.BorrowedCode;

import java.util.List;

public interface IBorrowBooksService {
    void createBorrow(BorrowedCode borrowedCode);

    BorrowedCode checkBorrowedCode(int code);

    List<BorrowedCode> displayAllCode();
}

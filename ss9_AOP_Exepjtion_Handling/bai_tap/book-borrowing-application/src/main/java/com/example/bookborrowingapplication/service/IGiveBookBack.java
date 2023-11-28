package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.model.BorrowedCode;

public interface IGiveBookBack {
    BorrowedCode checkBorrowedCode(int code);
}

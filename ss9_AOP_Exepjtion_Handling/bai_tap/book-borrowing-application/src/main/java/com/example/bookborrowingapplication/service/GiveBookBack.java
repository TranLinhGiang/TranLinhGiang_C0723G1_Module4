package com.example.bookborrowingapplication.service;

import com.example.bookborrowingapplication.model.BorrowedCode;
import com.example.bookborrowingapplication.repository.GiveBookBackRepository;
import com.example.bookborrowingapplication.repository.IBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiveBookBack implements IGiveBookBack{
    @Autowired
    private IBorrowRepository borrowRepository;
    @Override
    public BorrowedCode checkBorrowedCode(int code) {
        return borrowRepository.checkBorrowedCode(code);
    }
}

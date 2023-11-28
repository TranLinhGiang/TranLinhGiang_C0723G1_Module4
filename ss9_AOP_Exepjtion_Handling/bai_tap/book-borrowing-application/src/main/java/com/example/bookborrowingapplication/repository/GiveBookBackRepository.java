package com.example.bookborrowingapplication.repository;

import com.example.bookborrowingapplication.model.Book;
import com.example.bookborrowingapplication.model.BorrowedCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GiveBookBackRepository extends JpaRepository<BorrowedCode,Integer> {
}

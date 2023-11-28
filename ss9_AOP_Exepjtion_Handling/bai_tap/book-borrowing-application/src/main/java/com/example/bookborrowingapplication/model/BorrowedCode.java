package com.example.bookborrowingapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BorrowedCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int BorrowedCode;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public BorrowedCode(int borrowedCode, Book book) {
        BorrowedCode = borrowedCode;
        this.book = book;
    }

    public BorrowedCode(com.example.bookborrowingapplication.model.BorrowedCode borrowedCode, Book book) {

    }
}

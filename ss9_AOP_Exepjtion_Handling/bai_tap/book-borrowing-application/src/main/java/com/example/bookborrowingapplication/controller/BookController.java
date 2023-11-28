package com.example.bookborrowingapplication.controller;

import com.example.bookborrowingapplication.model.Book;
import com.example.bookborrowingapplication.model.BorrowedCode;
import com.example.bookborrowingapplication.service.IBookService;
import com.example.bookborrowingapplication.service.IBorrowBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

@Controller
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBorrowBooksService borrowBooksService;

    @GetMapping("")
    public String showForm(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "/home";
    }

    @GetMapping("/detail")
    public String showFormDetail(@RequestParam int id, Model model) {
        Book book = bookService.findByID(id);
        model.addAttribute("book", book);
        return "/detail";
    }

    @GetMapping("/borrowBooks")
    public String showFormBorrowBooks(@RequestParam int id, Model model) {
        Random random = new Random();
        int min = 10000;
        int max = 99999;
        int borrowCode;

        do {
            borrowCode = random.nextInt((max - min) + 1) + min;
        } while (borrowBooksService.checkBorrowedCode(borrowCode) != null);
        BorrowedCode borrowedCode;
        Book book = bookService.findByID(id);
        borrowedCode = new BorrowedCode(borrowCode, book);
        book.setQuantity(book.getQuantity() - 1);
        bookService.updateBook(book);
        model.addAttribute("borrowCode", borrowCode);

        if (book.getQuantity() == 0) {
            return "Sách đã hết";
        }
        return "/borrowBooks";
    }



    @GetMapping("/giveBookBack")
    public String showFormGiveBookBack(@RequestParam int id, Model model) {
       int giveBack = 0;
        if (borrowBooksService.checkBorrowedCode(giveBack) != null) {
            BorrowedCode borrowedCode = new BorrowedCode();
            Book book = bookService.findByID(id);
            borrowedCode = new BorrowedCode(borrowedCode, book);
            book.setQuantity(book.getQuantity() + 1);
            bookService.updateBook(book);
            model.addAttribute("pay", borrowedCode);
        }
        return "/giveBookBack";
    }
}

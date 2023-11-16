package com.example.mailbook.repository;

import com.example.mailbook.model.MailBook;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailBookRepository implements IMailBookRepository{
    private static final MailBook mailBook;
    static {
        mailBook= new MailBook("Language",5,"khkh","Giang");
    }
    @Override
    public MailBook getMailBook() {
        return mailBook;
    }

    @Override
    public MailBook update(MailBook mailBook1) {
        mailBook.setLanguage(mailBook1.getLanguage());
        mailBook.setSize(mailBook1.getSize());
        mailBook.setFilter(mailBook1.getFilter());
        mailBook.setSignature(mailBook1.getSignature());
        return null;
    }
}

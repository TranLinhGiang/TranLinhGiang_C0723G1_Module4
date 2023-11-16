package com.example.mailbook.service;

import com.example.mailbook.model.MailBook;
import com.example.mailbook.repository.IMailBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailBookService implements IMailBookService{
    @Autowired
    IMailBookRepository iMailBookRepository;
    @Override
    public MailBook getMailBook() {
        return iMailBookRepository.getMailBook();
    }

    @Override
    public MailBook update(MailBook mailBook) {
        return iMailBookRepository.update(mailBook);
    }
}

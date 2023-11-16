package com.example.mailbook.service;

import com.example.mailbook.model.MailBook;

public interface IMailBookService {
    MailBook getMailBook();

    MailBook update(MailBook mailBook);
}

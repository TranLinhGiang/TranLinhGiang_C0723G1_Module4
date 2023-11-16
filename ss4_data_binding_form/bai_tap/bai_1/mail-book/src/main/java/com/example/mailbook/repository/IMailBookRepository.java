package com.example.mailbook.repository;

import com.example.mailbook.model.MailBook;

public interface IMailBookRepository {
    MailBook getMailBook();

    MailBook update(MailBook mailBook);
}

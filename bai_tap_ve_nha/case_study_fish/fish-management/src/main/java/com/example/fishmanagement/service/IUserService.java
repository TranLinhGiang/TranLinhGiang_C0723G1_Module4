package com.example.fishmanagement.service;

import com.example.fishmanagement.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    void save(User blog);

    void update(User blog);

    User finById(int id);

    void remove(int id);
}

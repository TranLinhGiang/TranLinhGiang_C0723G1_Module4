package com.example.fishmanagement.service;

import com.example.fishmanagement.model.User;
import com.example.fishmanagement.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User blog) {
        userRepository.save(blog);
    }

    @Override
    public void update(User blog) {
        userRepository.save(blog);
    }

    @Override
    public User finById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void remove(int id) {
        userRepository.deleteById(id);
    }
}

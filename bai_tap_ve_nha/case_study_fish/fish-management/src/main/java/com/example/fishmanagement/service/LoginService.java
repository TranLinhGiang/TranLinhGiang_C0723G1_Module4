package com.example.fishmanagement.service;

import com.example.fishmanagement.model.Login;
import com.example.fishmanagement.repository.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
    @Autowired
    private ILoginRepository loginRepository;

    @Override
    public void save(Login login) {
        loginRepository.save(login);
    }
}

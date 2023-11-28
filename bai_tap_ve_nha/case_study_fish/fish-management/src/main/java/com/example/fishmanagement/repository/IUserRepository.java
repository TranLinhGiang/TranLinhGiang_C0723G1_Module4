package com.example.fishmanagement.repository;

import com.example.fishmanagement.model.Login;
import com.example.fishmanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}

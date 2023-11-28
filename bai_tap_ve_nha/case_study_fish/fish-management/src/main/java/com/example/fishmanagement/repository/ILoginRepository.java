package com.example.fishmanagement.repository;

import com.example.fishmanagement.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepository extends JpaRepository<Login,Integer> {
}

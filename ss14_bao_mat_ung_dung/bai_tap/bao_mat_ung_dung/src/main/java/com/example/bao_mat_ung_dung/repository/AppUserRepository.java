package com.example.bao_mat_ung_dung.repository;


import com.example.bao_mat_ung_dung.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUserName(String userName);
}
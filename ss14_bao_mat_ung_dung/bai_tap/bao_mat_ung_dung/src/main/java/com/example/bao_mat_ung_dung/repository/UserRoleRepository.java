package com.example.bao_mat_ung_dung.repository;


import com.example.bao_mat_ung_dung.entity.AppUser;
import com.example.bao_mat_ung_dung.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByAppUser(AppUser appUser);
}
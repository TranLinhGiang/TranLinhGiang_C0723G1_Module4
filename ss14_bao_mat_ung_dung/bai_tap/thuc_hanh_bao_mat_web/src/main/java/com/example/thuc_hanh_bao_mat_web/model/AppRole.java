package com.example.thuc_hanh_bao_mat_web.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "APP_ROLE")
public class AppRole {
    @Id
    @Column(name = "ROLE_ID")
    private int id;

    @Column(name = "ROLE_NAME", columnDefinition = "VARCHAR(45)")
    private String name;

    public AppRole() {
    }

    public AppRole(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

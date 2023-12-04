package com.example.thuc_hanh_bao_mat_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "APP_USER")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "CUSTOMER_NAME", columnDefinition = "VARCHAR(45)")
    private String name;

    @Column(name = "ENCRYTED_PASSWORD", columnDefinition = "VARCHAR(45)")
    private String password;

    @Column(name = "ENABLED")
    private String enabled;

    public AppUser() {
    }

    public AppUser(int id, String name, String password, String enabled) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.enabled = enabled;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }
}

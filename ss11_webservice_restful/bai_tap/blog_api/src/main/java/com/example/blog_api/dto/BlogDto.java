package com.example.blog_api.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class BlogDto {
    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Blog {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String poster;
        private String dateSubmitted;
    }
}

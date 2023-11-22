package com.example.productmanagemnet.service;

import com.example.productmanagemnet.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(Product product);

    void remove(int id);

    List<Product> searchName(String name);
}

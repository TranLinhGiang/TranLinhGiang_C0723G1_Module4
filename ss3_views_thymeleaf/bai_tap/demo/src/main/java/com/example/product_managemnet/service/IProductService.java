package com.example.product_managemnet.service;

import com.example.product_managemnet.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

  List<Product> search(String name);
}

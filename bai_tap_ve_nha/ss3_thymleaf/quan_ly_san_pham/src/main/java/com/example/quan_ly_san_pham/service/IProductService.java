package com.example.quan_ly_san_pham.service;

import com.example.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getProduct();

    void updateProduct(int id, Product product);

    void remove(int id);
    Product findById(int id);
}

package com.example.quan_ly_san_pham.repository;

import com.example.quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getProduct();

    void updateProduct(int id, Product product);
    void remove(int id);
    Product findById(int id);
}

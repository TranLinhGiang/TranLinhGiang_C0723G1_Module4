package com.example.shoppingcart.service;

import com.example.shoppingcart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Product findById(Long id);
}

package com.example.productmanagemnet.service;

import com.example.productmanagemnet.model.Product;
import com.example.productmanagemnet.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void update(Product product) {
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public List<Product> searchName(String name) {
        return null;
    }
}

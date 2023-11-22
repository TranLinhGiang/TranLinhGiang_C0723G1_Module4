package com.example.quan_ly_san_pham.service.impl;

import com.example.quan_ly_san_pham.model.Product;
import com.example.quan_ly_san_pham.repository.IProductRepository;
import com.example.quan_ly_san_pham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> getProduct() {
        return productRepository.getProduct();
    }

    @Override
    public void updateProduct(int id, Product product) {
         productRepository.updateProduct(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }
}

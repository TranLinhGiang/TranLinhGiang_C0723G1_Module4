package com.example.productmanagemnet.repository;

import com.example.productmanagemnet.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product,Integer> {

}

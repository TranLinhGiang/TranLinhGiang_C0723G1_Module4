package com.example.quan_ly_san_pham.repository.impl;

import com.example.quan_ly_san_pham.model.Product;
import com.example.quan_ly_san_pham.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1," táo" ,20000,"còn hàng"));
        productList.add(new Product(2," chuối", 30000,"hết hàng"));
        productList.add(new Product(3," đào", 40000,"còn hàng"));
        productList.add(new Product(4," mận", 50000,"hết hàng"));
        productList.add(new Product(5," măng cụt", 60000,"còn hàng"));
        productList.add(new Product(6," na", 70000,"hết hàng"));
        productList.add(new Product(7," đu đủ", 80000,"còn hàng"));
        productList.add(new Product(8," ổi", 90000,"còn hàng"));
    }

    @Override
    public List<Product> getProduct() {
        return productList;
    }

    @Override
    public void updateProduct(int id, Product product) {
        productList.add(id,product);
    }

    @Override
    public void remove(int id) {
       productList.remove(id);
    }

    @Override
    public Product findById(int id) {
        for (Product pr:productList) {
            if (pr.getId()==id){
                return pr;
            }
        }
        return null;
    }
}

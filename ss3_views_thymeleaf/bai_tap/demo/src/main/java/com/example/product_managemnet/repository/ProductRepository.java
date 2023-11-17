package com.example.product_managemnet.repository;

import com.example.product_managemnet.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    private static final List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "gan trời", 20000, "Vũ trụ", "12/12/2023"));
        productList.add(new Product(2, "tim đường tăng tạng", 30000, "Trung Quốc", "12/01/2023"));
        productList.add(new Product(3, "lông của tôn ngộ không", 40000, "Trung Quốc", "12/02/2023"));
        productList.add(new Product(4, "móng chân của rắn", 50000, "Việt Nam", "12/03/2023"));
        productList.add(new Product(5, "tóc hoàng thượng", 60000, "Bình Dương", "12/04/2023"));
        productList.add(new Product(6, "não robot", 70000, "Bình Dương", "12/05/2023"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
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

    @Override
    public void update(int id, Product product) {
        productList.add(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product>products= new ArrayList<>();
        for (Product valueSearch:productList) {
            if (valueSearch.getName().toLowerCase().contains(name.trim().toLowerCase())){
                products.add(valueSearch);
            }
        }
        return products;
    }
}

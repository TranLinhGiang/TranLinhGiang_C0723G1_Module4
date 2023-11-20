package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        List<Product> productList;
        TypedQuery<Product> query = entityManager.createQuery("from Product", Product.class);
        productList = query.getResultList();
        return productList;
    }

    @Transactional
    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Transactional
    @Override
    public void update(Product product) {
        Product productEdit = findById(product.getId());
        if (productEdit != null) {
            productEdit.setName(product.getName());
            productEdit.setPrice(product.getPrice());
            productEdit.setOrigin(product.getOrigin());
            productEdit.setExpiry(product.getExpiry());
            entityManager.merge(productEdit);
        }
    }

    @Transactional
    @Override
    public void remove(int id) {
        Product productRemove = findById(id);
        entityManager.remove(productRemove);
    }

    @Override
    public List<Product> searchName(String name) {
        List<Product> productList = new ArrayList<>();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product  p where p.name like :name",Product.class);
        query.setParameter("name","%" + name + "%");
        productList = query.getResultList();
        return productList;
    }
}

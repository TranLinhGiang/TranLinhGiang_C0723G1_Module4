package com.example.customer_mangement_thymeleaf.repository;

import com.example.customer_mangement_thymeleaf.model.Customer;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static final Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Ha Noi"));
        customers.put(2, new Customer(2, "Giang", "giang@codegym.vn", "Quang Binh"));
        customers.put(3, new Customer(3, "Piter", "piter@codegym.vn", "London"));
        customers.put(4, new Customer(4, "HaiTT", "hai@codegym.vn", "Da Nang"));
        customers.put(5, new Customer(5, "TungDC", "trung@codegym.vn", "Lai Chau"));
        customers.put(6, new Customer(6, "Hoang", "hoang@codegym.vn", "TP.Ho Chi Minh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}

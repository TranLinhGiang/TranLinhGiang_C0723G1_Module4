package com.example.examplecustomermanagement.repository;

import com.example.examplecustomermanagement.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
}

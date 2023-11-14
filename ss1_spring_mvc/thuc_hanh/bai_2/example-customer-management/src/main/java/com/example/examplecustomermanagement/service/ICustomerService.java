package com.example.examplecustomermanagement.service;

import com.example.examplecustomermanagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
}

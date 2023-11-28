package com.example.customer_list_management.service;

import com.example.customer_list_management.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws Exception;
    Customer findOne(Long id) throws Exception;
}

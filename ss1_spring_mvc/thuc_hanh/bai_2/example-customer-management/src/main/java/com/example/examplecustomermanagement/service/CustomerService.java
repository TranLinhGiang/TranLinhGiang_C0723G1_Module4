package com.example.examplecustomermanagement.service;

import com.example.examplecustomermanagement.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerService iCustomerService;
    @Override
    public List<Customer> findAll() {
        return iCustomerService.findAll();
    }
}

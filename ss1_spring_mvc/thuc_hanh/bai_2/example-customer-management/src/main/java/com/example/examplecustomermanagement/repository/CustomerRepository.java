package com.example.examplecustomermanagement.repository;

import com.example.examplecustomermanagement.model.Customer;
import com.example.examplecustomermanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();

    static {
    customerList.add(new Customer(1, "Nguyen Van A","gt07839@gmail.com","Quang Binh"));
    customerList.add(new Customer(2, "Nguyen Van B","gt07839@gmail.com","TP HCM"));
    customerList.add(new Customer(3, "Nguyen Van C","gt07839@gmail.com","Ha Noi"));
    customerList.add(new Customer(4, "Nguyen Van D","gt07839@gmail.com","Quang Ngai"));
    customerList.add(new Customer(5, "Nguyen Van E","gt07839@gmail.com","Quang Tri"));
    customerList.add(new Customer(6, "Nguyen Van F","gt07839@gmail.com","Da Nang"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}

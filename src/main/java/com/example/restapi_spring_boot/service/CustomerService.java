package com.example.restapi_spring_boot.service;

import com.example.restapi_spring_boot.entity.Customer;


import java.util.List;


public interface CustomerService {
    String createCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getById(long id);
    String updateCustomer(Customer customer);
    String deleteCustomerById(long id);
}

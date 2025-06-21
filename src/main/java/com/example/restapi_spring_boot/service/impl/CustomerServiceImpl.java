package com.example.restapi_spring_boot.service.impl;

import com.example.restapi_spring_boot.entity.Customer;
import com.example.restapi_spring_boot.repository.CustomerRepository;
import com.example.restapi_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public String createCustomer(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return "Customer saved successfully :"+newCustomer.getId();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public String updateCustomer(Customer customer) {
        if (customerRepository.existsById(customer.getId())){
            //for updating also we can use save() since if a value is present it will update it and if not it will add it
            Customer newCustomer = customerRepository.save(customer);
            return "Successfully updated the customer with the id -"+ customer.getId();
        }
        else {
            return "Update failed since the customer with the id -"+ customer.getId()+" doesnot exist";
        }
    }

    @Override
    public String deleteCustomerById(long id) {

        if (customerRepository.existsById(id)){
            customerRepository.deleteById(id);
            return "successfully deleted the customer with the id "+id;
        }
        else {

            return "Customer does not exist with the id "+id;
        }
    }
}

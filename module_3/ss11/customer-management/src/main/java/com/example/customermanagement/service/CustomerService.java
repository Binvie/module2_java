package com.example.customermanagement.service;

import com.example.customermanagement.model.Customer;
import com.example.customermanagement.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{
    CustomerRepository customerRepository = new CustomerRepository();
    private static Map<Integer,Customer> customerMap;
    @Override
    public Map<Integer,Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {

        customerRepository.save(customer);

    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerRepository.update(id,customer);
    }

    @Override
    public void remove(int id) {
    customerMap.remove(id);
    }
}

package com.example.customermanagement.repository;

import com.example.customermanagement.model.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomerRepository {

    Map<Integer,Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}

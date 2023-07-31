package com.example.customermanagement.repository;

import com.example.customermanagement.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository implements ICustomerRepository{
    private static final String INSERT = "insert into customers (customer_name, email, address, customer_status) value(?,?,?,?)";
    private static final String DISPLAY = "select * from customers";
    private static final String DELETE = "update customers set customer_status = 0 where id = ?";
    private static final String UPDATE = "update customers set " +
            "customer_name = ?, " +
            "email = ?, " +
            "address = ?, " +
            "customer_status = ? " +
            "where id = ?";
    @Override
    public Map<Integer,Customer> findAll() {
        Map<Integer,Customer> customerMap = new HashMap<>();
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("customer_name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                int customerStatus = resultSet.getInt("customer_status");
                customerMap.put(id, new Customer(id,name,email,address,customerStatus));
            }

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return customerMap;
    }

    @Override
    public void save(Customer customer) {
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getEmail());
            preparedStatement.setString(3,customer.getAddress());
            preparedStatement.setInt(4,customer.getCustomerStatus());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Customer findById(int id) {
        return findAll().get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getAddress());
            preparedStatement.setInt(4, customer.getCustomerStatus());
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int id) {
        Connection connection = Base.getConnection();
        try {
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement(DELETE);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

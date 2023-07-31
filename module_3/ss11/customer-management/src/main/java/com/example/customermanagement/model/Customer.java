package com.example.customermanagement.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String address;
    private int customerStatus;

    public Customer() {
    }

    public Customer(int id, String name, String email, String address, int customerStatus) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.customerStatus = customerStatus;
    }

    public Customer(String name, String email, String address, int customerStatus) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.customerStatus = customerStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(int customerStatus) {
        this.customerStatus = customerStatus;
    }
}

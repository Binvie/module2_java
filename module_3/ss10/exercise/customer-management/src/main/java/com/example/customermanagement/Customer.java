package com.example.customermanagement;

public class Customer {
    private String name;
    String date;
    String address;
    String link;

    public Customer() {
    }

    public Customer(String name, String date, String address, String link) {
        this.name = name;
        this.date = date;
        this.address = address;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

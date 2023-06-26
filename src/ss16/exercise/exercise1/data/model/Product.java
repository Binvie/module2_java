package ss16.exercise.exercise1.data.model;

import java.io.Serializable;

public class Product implements Serializable {
    int id;
    String name;
    int Price;
    String brand;
    String description;

    public Product() {
    }

    public Product(int id, String name, int price, String brand, String description) {
        this.id = id;
        this.name = name;
        Price = price;
        this.brand = brand;
        this.description = description;
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

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return id + "; " + name + "; " + getPrice() + "; " + brand + "; " + description;
    }
}

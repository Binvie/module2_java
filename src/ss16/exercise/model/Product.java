package ss16.exercise.model;

public class Product {
    int id;
    String name;
    int Price;
    String brand;
    String discription;

    public Product() {
    }

    public Product(int id, String name, int price, String brand, String discription) {
        this.id = id;
        this.name = name;
        Price = price;
        this.brand = brand;
        this.discription = discription;
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

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return id + ";" + name + ";" + getPrice() +";" + brand + ";" + discription;
    }
}

package service;

import model.Product;

import java.util.Map;

public interface IProductService {
    Map<Integer, Product> displayList();
    void createProduct(Product product);
    Product findByName(int id);
    void editProduct(int id, Product product);
    void remove(int id);
    public void save(Product product);
}

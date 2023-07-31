package service;

import model.Product;
import repository.ProductRepository;

import java.util.Map;

public class ProductService implements IProductService{
    ProductRepository productRepository = new ProductRepository();
    @Override
    public Map<Integer, Product> displayList() {
        return productRepository.displayList();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public Product findByName(int id) {
        return productRepository.findByName(id);
    }

    @Override
    public void editProduct(int id, Product product) {
        productRepository.editProduct(id, product);
    }

    @Override
    public void remove(int id) {
    productRepository.displayList().remove(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}

package ss16.exercise.exercise1.data.repository;

import ss16.exercise.exercise1.data.model.Product;

import java.util.List;

public interface IProductRepository {
    void addNew(Product product);

    List<Product> display();

    void searchProduct(int id);

    int searchID(int id);

}

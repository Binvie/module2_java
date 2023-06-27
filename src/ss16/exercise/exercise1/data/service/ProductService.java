package ss16.exercise.exercise1.data.service;

import ss16.exercise.exercise1.data.model.Product;
import ss16.exercise.exercise1.data.repository.IProductRepository;
import ss16.exercise.exercise1.data.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

import static trainning.repository.TeacherRepository.scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public void addNew() {
        System.out.println("Enter Product's ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Product's name");
        String name = scanner.nextLine();
//        int id, String name, int price, String brand, String description
        System.out.println("Enter Product's price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Product's brand");
        String brand = scanner.nextLine();
        System.out.println("Enter Product's description");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, brand, description);
        productRepository.addNew(product);

    }

    @Override
    public void display() {
        List<Product> productList1 = new ArrayList<>();
        productList1 = productRepository.display();
        for (Product product : productList1) {
            System.out.println(product);
        }
//        productRepository.display();
    }

    @Override
    public void searchProduct() {
        System.out.println("Enter product's id that you wanna find: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = productRepository.searchID(id);
        productRepository.searchProduct(index);

    }
}

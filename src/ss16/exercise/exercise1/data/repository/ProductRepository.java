package ss16.exercise.exercise1.data.repository;

import ss16.exercise.exercise1.data.common.ReadAndWrite;
import ss16.exercise.exercise1.data.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PRODUCT_PATH = "D:\\Codegym_source\\module2\\module2_java\\src\\ss16\\exercise\\exercise1\\data\\product.dat";
    public static List<Product> productList = new ArrayList<>();

    //D:\Codegym_source\module2\module2_java\src\ss16\exercise\data\product.dat
        static {
        productList.add(new Product(1,"thien",222,"th","th"));
    //    ReadAndWrite.writeBinaryFile(PRODUCT_PATH,productList);
        }

    @Override
    public void addNew(Product product) {
        List<Product> products = ReadAndWrite.readBinaryFile(PRODUCT_PATH);
        products.add(product);
        ReadAndWrite.writeBinaryFile(PRODUCT_PATH, products);
    }

    @Override
    public List<Product> display() {
        List<Product> productArrayList = new ArrayList<>();
        productArrayList = ReadAndWrite.readBinaryFile(PRODUCT_PATH);
        return productArrayList;
    }

    @Override
    public void searchProduct(int id) {
        if (id == -1) {
            System.out.println("There is no product ");
        } else {
            System.out.println(productList.get(id));
        }
    }

    @Override
    public int searchID(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }

        }
        return -1;
    }

}

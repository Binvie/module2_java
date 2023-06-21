package ss12.exercise.repository;

import ss12.exercise.model.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
//        return o1.getName().compareTo(o2.getName());
        return o1.getPrice() - o2.getPrice();
    }
}

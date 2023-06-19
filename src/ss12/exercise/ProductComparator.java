package ss12.exercise;

import java.util.Comparator;

public class ProductComparator implements Comparator<ProductModel> {
    @Override
    public int compare(ProductModel o1, ProductModel o2) {
//        return o1.getName().compareTo(o2.getName());
        return o1.getPrice() - o2.getPrice();
    }
}

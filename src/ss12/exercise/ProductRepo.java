package ss12.exercise;

import java.util.*;

public class ProductRepo  {
    public static List<ProductModel> list = new ArrayList<>();

    static {
        list.add(new ProductModel(1, "fan", 500, "Thien"));
        list.add(new ProductModel(2, "table", 1000, "Thoi"));
        list.add(new ProductModel(3, "chair", 300, "Thien"));
        list.add(new ProductModel(4, "AC", 5000, "Thien"));
    }

    public void addNew(ProductModel productModel) {
        list.add(productModel);
    }

    public void edit(int id, ProductModel productModel) {
        Scanner sc = new Scanner(System.in);
        int index = seachId(id);
        System.out.println(list.get(index));
        System.out.println("Confirm to edit this product (yes or no)?");

        String input = sc.nextLine().toLowerCase();
        if (input.equals("yes")) {
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                    list.set(i, productModel);
                }
            }
        } else System.out.println("cancel");
    }

    public void delete(int id) {
        Scanner sc = new Scanner(System.in);
        int index = seachId(id);
        System.out.println("Confirm to delete this product ( yes or no)?");
        System.out.println(list.get(index));
        String input = sc.nextLine().toLowerCase();
        if (input.equals("yes")) {
            list.remove(list.get(index));
        } else System.out.println("cancel");
    }


    public void display() {
        for (ProductModel value : list) {
            System.out.println(value);
        }
    }

    public int seachId(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public void searchByName(String name){
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName())){
                flag = true;
                index = i;
            }else flag = false;
        }if (flag == true){
            System.out.println(list.get(index));
        }else System.out.println("not available");
    }

    public void arrangeProductList() {
//        Collections.sort(list,new ProductComparator());
        Collections.sort(list,new ProductComparator());
    }
}

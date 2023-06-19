package ss12.exercise;

import java.util.Scanner;

public class ProductManager {
    ProductRepo productRepo = new ProductRepo();

    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product's id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product's name");
        String name = sc.nextLine();
        System.out.println("Enter product's price");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product's brand");
        String brand = sc.nextLine();
        ProductModel productModel1 = new ProductModel(id, name, price, brand);
        productRepo.addNew(productModel1);
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter product's id that you wanna edit:");
        int id = Integer.parseInt(sc.nextLine());
        int index = productRepo.seachId(id);
        if (index == -1) {
            System.out.println("not available");

        } else {
            System.out.println("Change product's name");
            String name = sc.nextLine();
            System.out.println("Change product's price");
            int price = Integer.parseInt(sc.nextLine());
            System.out.println("Change product's brand");
            String brand = sc.nextLine();
            ProductModel productModel2 = new ProductModel(id, name, price, brand);
            productRepo.edit(id, productModel2);
        }
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter product's id that you wanna delete:");
        int id = Integer.parseInt(sc.nextLine());
        productRepo.delete(id);
    }

    public void display() {
        productRepo.display();
    }
    public void searchByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product's name");
        String name = sc.nextLine();
        productRepo.searchByName(name);
    }
    public void arrangeProductList() {
        productRepo.arrangeProductList();
    }
}

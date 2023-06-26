package ss16.exercise.exercise1.data.view;

import ss16.exercise.exercise1.data.controller.ProductController;

public class Run {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}

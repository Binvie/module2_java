package ss16.exercise.exercise1.data.controller;

import ss16.exercise.exercise1.data.service.ProductService;

import static trainning.repository.TeacherRepository.scanner;

public class ProductController {
    public void showMenu() {
        ProductService productService = new ProductService();
        boolean flag = true;
        do {
            System.out.println("Product Management Program :" +
                    "\n1. Add new Product." +
                    "\n2. Product information by ID." +
                    "\n3. Display Product list." +
                    "\n4. Exit.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("--------Add new Product--------");
                    productService.addNew();
                    break;
                case 2:
                    System.out.println("---------Product information by ID --------");
                    productService.searchProduct();
                    break;
                case 3:
                    System.out.println("----------Display Product List------------");
                    productService.display();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (flag);
    }
}

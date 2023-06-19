package ss12.exercise;

import java.util.Scanner;

public class Controller {
    ProductManager productManager = new ProductManager();
    boolean flag = true;

    void showMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println(" Product management program:" +
                    "\n1. Add new product." +
                    "\n2. Edit product." +
                    "\n3. Remove product." +
                    "\n4. Display product's list." +
                    "\n5. Search product according to name" +
                    "\n6. Price increasing list , Price decreasing list." +
                    "\n7. Exit.");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(" -------- Add new product ---------");
                    productManager.addNew();

                    break;
                case 2:
                    System.out.println(" -------- Edit product ---------");
                    productManager.edit();
                    break;
                case 3:
                    System.out.println(" -------- Remove product ---------");
                    productManager.delete();
                    break;
                case 4:
                    System.out.println(" -------- Display product list ---------");
                    productManager.display();
                    break;
                case 5:
                    System.out.println(" -------- Search product.name ---------");
                    productManager.searchByName();
                    break;
                case 6:
                    System.out.println(" -------- Price increasing,decreasing list ---------");
                    productManager.arrangeProductList();
                    break;
                case 7:
                    System.exit(0);
            }
        } while (flag);
    }
}

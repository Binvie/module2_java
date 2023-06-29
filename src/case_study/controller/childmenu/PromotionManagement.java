package case_study.controller.childmenu;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class PromotionManagement {
    public void promotionMenu() {
        boolean flag = true;
        do {
            try {
                System.out.println("-------------Promotion Management-----------\n" +
                        "1. Display list customers use service\n" +
                        "2. Display list customers get voucher\n" +
                        "3. Return main menu\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("--------Display list customers use service---------");
                        break;
                    case 2:
                        System.out.println("--------Display list customers get voucher---------");
                        break;
                    case 3:
                        System.out.println("--------Return main menu---------");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (true);
    }
}

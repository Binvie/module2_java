package case_study.controller.childmenu;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class FacilityManagement {
    public void facilityMenu() {
        boolean flag = true;
        do {
            try {
                System.out.println("--------Facility Management------------\n" +
                        "1 Display list facility\n" +
                        "2 Add new facility\n" +
                        "3 Display list facility maintenance\n" +
                        "4 Return main menu\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("---------Display list facility---------");
                        break;
                    case 2:
                        System.out.println("---------Add new facility---------");
                        break;
                    case 3:
                        System.out.println("---------Display list facility maintenance---------");
                        break;
                    case 4:
                        System.out.println("---------Return main menu---------");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (true);
    }
}

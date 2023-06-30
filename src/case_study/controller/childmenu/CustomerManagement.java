package case_study.controller.childmenu;

import case_study.service.person_service.CustomerService;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class CustomerManagement {
    CustomerService customerService = new CustomerService();
    public void customerMenu() {
        boolean flag = true;
        do {
            try {
                System.out.println("-----------Customer Management-----------\n" +
                        "1. Display list customers\n" +
                        "2. Add new customer\n" +
                        "3. Edit customer\n" +
                        "4. Return main menu\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("-----------Display list customers-----------");
                        customerService.displayCustomerList();
                        break;
                    case 2:
                        System.out.println("-----------Add new customer-----------");
                        customerService.addNewCustomer();
                        break;
                    case 3:
                        System.out.println("-----------Edit customer-----------");
                        customerService.editCustomer();
                        break;
                    case 4:
                        System.out.println("-----------Return main menu-----------");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (true);
    }
}

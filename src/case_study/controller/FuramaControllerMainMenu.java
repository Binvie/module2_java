package case_study.controller;

import case_study.controller.childmenu.*;

import java.util.Scanner;

public class FuramaControllerMainMenu {
    public static Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Furama Resort Management:" +
                    "\n1. Employee Management." +
                    "\n2. Customer Management." +
                    "\n3. Facility Management." +
                    "\n4. Booking Management." +
                    "\n5. Promotion Management." +
                    "\n6. Exit");
            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        EmployeeManagement employeeManagement = new EmployeeManagement();
                        employeeManagement.employeesMenu();
                        break;
                    case 2:
                        CustomerManagement customerManagement = new CustomerManagement();
                        customerManagement.customerMenu();
                        break;
                    case 3:
                        FacilityManagement facilityManagement = new FacilityManagement();
                        facilityManagement.facilityMenu();
                        break;
                    case 4:
                        BookingManagement bookingManagement = new BookingManagement();
                        bookingManagement.BookingMenu();
                        break;
                    case 5:
                        PromotionManagement promotionManagement = new PromotionManagement();
                        promotionManagement.promotionMenu();
                        break;
                    case 6:
                        System.out.println("Bye bồ");
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        }while (true) ;
    }
}

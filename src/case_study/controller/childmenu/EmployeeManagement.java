package case_study.controller.childmenu;

import case_study.repository.booking.BookingRepository;
import case_study.repository.customer.CustomerRepository;
import case_study.repository.employee.EmployeeRepository;
import case_study.repository.facility.FacilityRepository;
import case_study.service.booking.BookingService;
import case_study.service.person_service.CustomerService;
import case_study.service.person_service.EmployeeService;
import case_study.service.person_service.IEmployeeService;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class EmployeeManagement {
    public void employeesMenu() {
        IEmployeeService employeeService  = new EmployeeService();

        do {
            try {
                System.out.println("--------Employee Management------------\n" +
                        "1.Display list employees\n" +
                        "2.Add new employee\n" +
                        "3.Edit employee\n" +
                        "4.Return main menu\n");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("-----Display list employees-----");
                        employeeService.displayEmployeeList();
                        break;
                    case 2:
                        System.out.println("-----Add new employee-----");
                        employeeService.addNewEmployee();
                        break;
                    case 3:
                        System.out.println("-----Edit employee-----");
                        employeeService.editEmployee();
                        break;
                    case 4:
                        System.out.println("-----Return main menu-----");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("try again");
            }
        } while (true);
    }
}

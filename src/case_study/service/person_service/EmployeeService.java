package case_study.service.person_service;

import case_study.model.person.Employee;
import case_study.repository.employee.EmployeeRepository;
import case_study.repository.employee.IEmployeeRepository;
import case_study.utils.CheckValidate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static trainning.repository.TeacherRepository.scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    CheckValidate checkValidate = new CheckValidate();

    @Override
    public void displayEmployeeList() {
        System.out.println("-----Employees List-----");
        List<Employee> list = employeeRepository.displayEmployeeList();
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void addNewEmployee() {
        System.out.println("-----Add New Employee-----");
        //int employeeID, String name, String date, boolean gender, String identity, String phoneNumber, String email, String level, String position, double salary
        String id = checkValidate.checkID();
        String name = checkValidate.checkName();
        String date = checkValidate.checkDate();
        System.out.println("Enter employee's gender (true : male, false : female) :");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        String identity = checkValidate.checkIdentity();
        System.out.println("Enter employee's phoneNumber :");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter employee's email :");
        String email = scanner.nextLine();
        System.out.println("Enter employee's level :");
        String level = scanner.nextLine();
        System.out.println("Enter employee's position :");
        String position = scanner.nextLine();
        double salary = checkValidate.checkSalary();
        Employee employee = new Employee(id, name, date, gender, identity, phoneNumber, email, level, position, salary);
        employeeRepository.addNewEmployee(employee);
    }

    @Override
    public void editEmployee() {
        System.out.println("Enter employee's id that you wanna edit :");
        String id = scanner.nextLine();
        List<Employee> list = employeeRepository.displayEmployeeList();
        int index1 = employeeRepository.searchID(id);
        System.out.println("choose 1 to edit employee's info. 2 , to delete employee");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            if (id.equals(list.get(index1).getEmployeeID())) {
                String id1 = id;
                System.out.println("Enter employee's name :");
                String name = scanner.nextLine();
                System.out.println("Enter employee's date :");
                String date = scanner.nextLine();
                System.out.println("Enter employee's gender (true : male, false : female) :");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter employee's identity :");
                String identity = scanner.nextLine();
                System.out.println("Enter employee's phoneNumber :");
                String phoneNumber = scanner.nextLine();
                System.out.println("Enter employee's email :");
                String email = scanner.nextLine();
                System.out.println("Enter employee's level :");
                String level = scanner.nextLine();
                System.out.println("Enter employee's position :");
                String position = scanner.nextLine();
                System.out.println("Enter employee's salary :");
                double salary = Double.parseDouble(scanner.nextLine());
                Employee employee = new Employee(id, name, date, gender, identity, phoneNumber, email, level, position, salary);
                employeeRepository.editEmployee(index1, employee);
            } else System.out.println("This employee is not available");
        } else if (choice == 2) {
            employeeRepository.deleteEmployee(index1);
        }
    }
}

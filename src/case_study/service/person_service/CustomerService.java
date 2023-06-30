package case_study.service.person_service;

import case_study.model.person.Customer;
import case_study.repository.customer.CustomerRepository;
import case_study.utils.CheckValidate;

import java.util.ArrayList;
import java.util.List;

import static trainning.repository.TeacherRepository.scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayCustomerList() {
        List<Customer> customerList = customerRepository.displayCustomerList();
        for (Customer s: customerList) {
            System.out.println(s);
        }
    }
    CheckValidate checkValidate = new CheckValidate();
    @Override
    public void addNewCustomer() {
        String id = checkValidate.checkCustomerID();
        String name = checkValidate.checkName();
        String date = checkValidate.checkDate();
        System.out.println("Enter customer's gender (true : male, false : female): ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        String identity = checkValidate.checkIdentity();
        String phoneNumber = checkValidate.checkPhoneNumber();
        System.out.println("Enter customer's email: ");
        String email = scanner.nextLine();
        System.out.println("Enter customer's customer Type: ");
        String customerType = scanner.nextLine();
        System.out.println("Enter customer's address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, date, gender, id, phoneNumber, email, customerType, address);
        customerRepository.addNewCustomer(customer);
    }
//String id, String name, String date, boolean gender, String identity, String phoneNumber, String email, String customerType, String address

    @Override
    public void editCustomer() {
        System.out.println("Enter customer's id that you wanna edit :");
        String customerID = scanner.nextLine();
        int index = customerRepository.checkID(customerID);
        String id = customerID;
        String name = checkValidate.checkName();
        String date = checkValidate.checkDate();
        System.out.println("Enter customer's gender (true : male, false : female): ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        String identity = checkValidate.checkIdentity();
        String phoneNumber = checkValidate.checkPhoneNumber();
        System.out.println("Enter customer's email: ");
        String email = scanner.nextLine();
        System.out.println("Enter customer's customer Type: ");
        String customerType = scanner.nextLine();
        System.out.println("Enter customer's address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, date, gender, id, phoneNumber, email, customerType, address);
        customerRepository.editCustomer(index,customer);
    }
}

package case_study.utils;

import static trainning.repository.TeacherRepository.scanner;

public class CheckValidate {
    public static final String EMPLOYEE_ID = "^NV-\\d{4}$";
    public static final String CUSTOMER_ID = "^KH-\\d{4}$";
    public static final String EMPLOYEE_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
    public static final String CUSTOMER_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
    public static final String EMPLOYEE_DATE = "^(19[0-9]{2}|2[0-9]{3})-(0[1-9]|1[012])-([123]0|[012][1-9]|31)$";
    public static final String EMPLOYEE_IDENTITY = "^(\\d{9}|\\d{12})$";
    public static final String EMPLOYEE_PHONENUMBER = "^0\\d{9}$";


    public String checkID() {
        boolean flag = true;
        try {
            System.out.println("Enter employee's id: (NV-XXXX with X is a number) ");
            String employeeID = scanner.nextLine();
            if (employeeID.matches(EMPLOYEE_ID)) {
                return employeeID;
            } else {
                return checkID();
            }
        } catch (Exception e) {
            System.out.println("Invalid id");
            return checkID();
        }
    }
    public String checkName() {
        try {
            System.out.println("Enter name (uppercase first letter) :");
            String employeeName = scanner.nextLine();
            if (employeeName.matches(EMPLOYEE_NAME)) {
                return employeeName;
            } else return checkName();
        } catch (Exception e) {
            System.out.println("Invalid name");
            return checkName();
        }
    }
    public String checkDate() {
        try {
            System.out.println("Enter date (yyyy-MM-DD) :");
            String date = scanner.nextLine();
            if (date.matches(EMPLOYEE_DATE)) {
                return date;
            } else return checkDate();
        } catch (Exception e) {
            System.out.println("Invalid date");
            return checkDate();
        }
    }
    public String checkIdentity() {
        try {
            System.out.println("Enter identity :");
            String identity = scanner.nextLine();
            if (identity.matches(EMPLOYEE_IDENTITY)) {
                return identity;
            } else return checkIdentity();
        } catch (Exception e) {
            return checkIdentity();
        }
    }
    public String checkPhoneNumber() {
        try {
            System.out.println("Enter phone number : ");
            String phonerNumber = scanner.nextLine();
            if (phonerNumber.matches(EMPLOYEE_PHONENUMBER)) {
                return phonerNumber;
            } else return checkPhoneNumber();
        } catch (Exception e) {
            return checkPhoneNumber();
        }
    }
    public double checkSalary() {
        try {
            System.out.println("Enter employee's salary :");
            double salary = Double.parseDouble(scanner.nextLine());
            if (salary > 0) {
                return salary;
            } else return checkSalary();
        } catch (NumberFormatException e) {
            System.out.println("Try again");
            return checkSalary();
        }
    }

    public String checkCustomerID() {
        try {
            System.out.println("Enter customer's Id (KH-YYYY with Y is a number): ");
            String id = scanner.nextLine();
            if (id.matches(CUSTOMER_ID)) {
                return id;
            } else return checkCustomerID();
        } catch (Exception e) {
            return checkCustomerID();
        }
    }

    public String checkCustomerName() {
        try {
            System.out.println("Enter customer's name (first letter is uppercase): ");
            String name = scanner.nextLine();
            if (name.matches(CUSTOMER_NAME)) {
                return name;
            } else return checkCustomerName();
        } catch (Exception e) {
            return checkCustomerName();
        }
    }
}

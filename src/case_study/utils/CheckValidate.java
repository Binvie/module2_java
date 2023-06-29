package case_study.utils;

import java.util.regex.Pattern;

import static trainning.repository.TeacherRepository.scanner;

public class CheckValidate {
    public static final String EMPLOYEE_ID = "^NV-\\d{4}$";
    public static final String EMPLOYEE_NAME = "^([A-Z][a-z]+\\s)+[A-Z][a-z]*$";
    public static final String EMPLOYEE_DATE = "^(19[0-9]{2}|2[0-9]{3})-(0[1-9]|1[012])-([123]0|[012][1-9]|31)$";
    public static final String EMPLOYEE_GENDER = "";

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
            System.out.println("Enter employee's name (uppercase first letter) :");
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
            System.out.println("Enter employee's date (yyyy-MM-DD) :");
            String date = scanner.nextLine();
            if (date.matches(EMPLOYEE_DATE)) {
                return date;
            } else return checkName();
        } catch (Exception e) {
            System.out.println("Invalid date");
            return checkName();
        }
    }

//    public static boolean checksalary(){
//        boolean flag = true;
//        do {
//            try {
//                System.out.println("Enter employee's salary :");
//                salary = Double.parseDouble(scanner.nextLine());
//                flag = false;
//            } catch (NumberFormatException e) {
//                System.out.println("Try again");
//                flag = true;
//            }
//        } while (flag);
//    }
}

package case_study.utils;

import static case_study.controller.FuramaControllerMainMenu.scanner;

public class CheckFacilityValidate {
    public static final String FACILITY_ID = "^SV(VL|HO|RO)-\\d{4}$";
    public static final String FACILITY_NAME = "^([A-Z][a-z]+\\s)*[A-Z][a-z]+$";

    public String checkID() {
        try {
            System.out.println("Enter Service's id: ");
            String id = scanner.nextLine();
            if (id.matches(FACILITY_ID)) {
                return id;
            } else {
                return checkID();
            }
        } catch (Exception e) {
            return checkID();
        }
    }

    public String checkName() {
        try {
            System.out.println("Enter Service's name :");
            String name = scanner.nextLine();
            if (name.matches(FACILITY_NAME)) {
                return name;
            } else {
                return checkName();
            }
        } catch (Exception e) {
            return checkName();
        }
    }

    public double checkPoolArea() {
        try {
            System.out.println("Enter pool area :");
            double poolArea = Double.parseDouble(scanner.nextLine());
            if (poolArea > 30) {
                return poolArea;
            } else return checkPoolArea();
        } catch (NumberFormatException e) {
            return checkPoolArea();
        }
    }

    public double checkRentingPrice() {
        try {
            System.out.println("Enter Renting Price :");
            double rentingPrice = Double.parseDouble(scanner.nextLine());
            if (rentingPrice > 30) {
                return rentingPrice;
            } else return checkRentingPrice();
        } catch (NumberFormatException e) {
            return checkRentingPrice();
        }
    }

    public int checkNumberPerson() {
        try {
            System.out.println("Enter number of available people :");
            int numberPeople = Integer.parseInt(scanner.nextLine());
            if (numberPeople > 0 && numberPeople < 20) {
                return numberPeople;
            } else return checkNumberPerson();
        } catch (NumberFormatException e) {
            return checkNumberPerson();
        }
    }

    public int checkNumberFloor() {
        try {
            System.out.println("Enter number of floor :");
            int numberFloor = Integer.parseInt(scanner.nextLine());
            if (numberFloor > 0) {
                return numberFloor;
            } else return checkNumberFloor();
        } catch (NumberFormatException e) {
            return checkNumberFloor();
        }
    }

    public String checkServiceType() {
        try {
            System.out.println("Enter Service's type :");
            String serviceType = scanner.nextLine();
            if (serviceType.matches(FACILITY_NAME)) {
                return serviceType;
            } else {
                return checkServiceType();
            }
        } catch (Exception e) {
            return checkServiceType();
        }
    }
}

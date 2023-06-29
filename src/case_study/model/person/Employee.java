package case_study.model.person;

import java.util.List;

public class Employee extends Person {
    private String employeeID;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeID, String level, String position, double salary) {
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String employeeID, String name, String date, boolean gender, String identity, String phoneNumber, String email, String level, String position, double salary) {
        super(name, date, gender, identity, phoneNumber, email);
        this.employeeID = employeeID;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary + '}';
    }

    public String convertToStringList() {
        return employeeID + "," + name + "," + date + "," + gender + "," + identity + "," + phoneNumber + "," + email + "," + level + "," + position + "," + salary;
    }
}


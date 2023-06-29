package case_study.repository.employee;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployeeList();

    void addNewEmployee(Employee employee);

    void editEmployee(int index, Employee employee);

    int searchID(String id);
    void deleteEmployee(int id);
}

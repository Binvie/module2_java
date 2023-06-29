package case_study.repository.employee;

import case_study.common.ReadAndWrite;
import case_study.model.person.Employee;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    ReadAndWrite readAndWrite = new ReadAndWrite();
//    public static List<Employee> employeeList = new ArrayList<>();
//
//    static {
//        employeeList.add(new Employee("NV-0001", "Thien", "23/05/1997", true, "191897546", "0936131657", "thien@gmail.com", "master", "manager", 30000000));
//        employeeList.add(new Employee("NV-0002", "Thoi", "12/11/1998", false, "012387512", "012387512", "thoi@gmail.com", "master", "employee", 10000000));
//        employeeList.add(new Employee("NV-0003", "Sang", "20/10/1997", true, "012938952", "012938952", "sang@gmail.com", "master", "employee", 10000000));
////       List<String> stringList = new ArrayList<>();
////        for (Employee e : employeeList) {
////            stringList.add(e.convertToStringList());
////        }
////        readAndWrite.writeFile(ReadAndWrite.EMPLOYEE,stringList);
//
//    }


    public List<Employee> displayEmployeeList() {
        List<Employee> employeeList1 = new ArrayList<>();
        List<String> list = readAndWrite.readFile(ReadAndWrite.EMPLOYEE);
        String[] info = null;
        for (String s : list) {
            info = s.split(",");
            employeeList1.add(new Employee(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8], Double.parseDouble(info[9])));
            //int employeeID, String name, String date, boolean gender, String identity, String phoneNumber, String email, String level, String position, double salary
        }
        return employeeList1;
    }

    public List<String> convertString(List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee e : employeeList) {
            stringList.add(e.convertToStringList());
        }
        return stringList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        List<Employee> list = displayEmployeeList();
        list.add(employee);
        List<String> stringList = convertString(list);
        readAndWrite.writeFile(ReadAndWrite.EMPLOYEE, stringList);
    }

    @Override
    public void editEmployee(int index, Employee employee) {
        List<Employee> list = displayEmployeeList();
        list.set(index, employee);
        List<String> stringList = convertString(list);
        readAndWrite.writeFile(ReadAndWrite.EMPLOYEE, stringList);

    }

    @Override
    public int searchID(String id) {
        List<Employee> list = displayEmployeeList();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getEmployeeID())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteEmployee(int id) {
        List<Employee> list = displayEmployeeList();
        list.remove(id);
        List<String> stringList = convertString(list);
        readAndWrite.writeFile(ReadAndWrite.EMPLOYEE, stringList);
    }
}

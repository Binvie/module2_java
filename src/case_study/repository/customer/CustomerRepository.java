package case_study.repository.customer;

import case_study.common.ReadAndWrite;
import case_study.model.person.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerRepository implements ICustomerRepository {
    public static List<Customer> customerList = new ArrayList<>();

    public static final String CUSTOMER_DATA = "module2_java/src/case_study/common/customer.csv";
    ReadAndWrite readAndWrite = new ReadAndWrite();

//    static {
//        //String id, String name, String date, boolean gender, String identity, String phoneNumber, String email, String customerType, String address
//        ReadAndWrite readAndWrite = new ReadAndWrite();
//
//        customerList.add(new Customer("KH-0001", "Hai Bui", "1999-09-19", true, "123456789000", "0123456789", "hai@gmail.com", "gold", "Da Nang"));
//        customerList.add(new Customer("KH-0002", "Sang Phan", "1888-08-18", true, "123456789111", "0123456789", "sang@gmail.com", "older", "Hue"));
//        customerList.add(new Customer("KH-0003", "Thoi Sac Thoi", "177-07-17", true, "123456789222", "0123456789", "thoi@gmail.com", "oldshit", "Da Nang"));
//        customerList.add(new Customer("KH-0004", "Thien Le", "1997-05-23", true, "123456789333", "0123456789", "thien@gmail.com", "gold", "Sai Gon"));
//        List<String> stringList = new ArrayList<>();
//        for (Customer c : customerList) {
//            stringList.add(c.convertToString());
//        }
//        readAndWrite.writeFile(CUSTOMER_DATA, stringList);
//    }

    @Override
    public List<Customer> displayCustomerList() {
        List<Customer> customerList1 = new ArrayList<>();
        customerList.clear();
        List<String> stringList = readAndWrite.readFile(CUSTOMER_DATA);
        String[] info = null;
        for (String c : stringList) {
            info = c.split(",");
            customerList1.add(new Customer(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8]));
        }
        return customerList1;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        List<Customer> list = displayCustomerList();
        list.add(customer);
        for (Customer c : customerList) {

            stringList.add(c.convertToString());
        }
        readAndWrite.writeFile(CUSTOMER_DATA, stringList);
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        List<Customer> customerList = displayCustomerList();
        customerList.set(index, customer);
        List<String> stringList = convertToString(customerList);
        readAndWrite.writeFile(CUSTOMER_DATA, stringList);
    }

    @Override
    public int checkID(String index) {
        List<Customer> customerList = displayCustomerList();
        for (int i = 0; i < customerList.size(); i++) {
            if (Objects.equals(index, customerList.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public List<String> convertToString(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (Customer c : customerList) {
            stringList.add(c.convertToString());
        }
        return stringList;
    }
}

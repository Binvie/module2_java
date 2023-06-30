package case_study.repository.customer;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayCustomerList();

    void addNewCustomer(Customer customer);

    void editCustomer(int index, Customer customer);

    int checkID(String id);
}

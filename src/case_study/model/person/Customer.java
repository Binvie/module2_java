package case_study.model.person;

public class Customer extends Person {
    private String id;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String id, String customerType, String address) {
        this.id = id;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String date, boolean gender, String identity, String phoneNumber, String email, String customerType, String address) {
        super(name, date, gender, identity, phoneNumber, email);
        this.id = id;
        this.customerType = customerType;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //String id, String name, String date, boolean gender, String identity, String phoneNumber, String email, String customerType, String address
    public String convertToString() {
        return id + "," + name + "," + date + "," + gender + "," + identity + "," + phoneNumber + "," + email + "," + customerType + "," + address;
    }
}

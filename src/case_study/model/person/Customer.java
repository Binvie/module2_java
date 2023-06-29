package case_study.model.person;

public class Customer extends Person{
    private int id;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(int id, String customerType, String address) {
        this.id = id;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String name, String date, boolean gender, String identity, String phoneNumber, String email, int id, String customerType, String address) {
        super(name, date, gender, identity, phoneNumber, email);
        this.id = id;
        this.customerType = customerType;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

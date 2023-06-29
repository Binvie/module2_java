package case_study.model.person;

public abstract class Person {
    protected String name;
    protected String date;
    protected boolean gender;
    protected String identity;
    protected String phoneNumber;
    protected String email;

    public Person() {
    }

    public Person(String name, String date, boolean gender, String identity, String phoneNumber, String email) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", identity='" + identity + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

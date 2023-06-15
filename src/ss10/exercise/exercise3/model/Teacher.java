package ss10.exercise.exercise3.model;

public class Teacher extends Person {
    public String major;

    public Teacher(int id, String dateOfBirth, String name, boolean sex, String major) {
        super(id, dateOfBirth, name, sex);
        this.major = major;
    }

    public Teacher(String major) {
        this.major = major;
    }

    public Teacher(int id, String dateOfBirth, String name, boolean sex) {
        super(id, dateOfBirth, name, sex);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

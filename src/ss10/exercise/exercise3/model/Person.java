package ss10.exercise.exercise3.model;

public abstract class Person {
    public int id;
    public String dateOfBirth;
    public String name;
    public boolean sex;

    public Person(int id, String dateOfBirth, String name, boolean sex) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}

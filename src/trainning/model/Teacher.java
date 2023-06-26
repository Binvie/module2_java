package trainning.model;

public class Teacher {
    private int id;
    private String name;
    private String date;
    String gender;

    String major;

    public Teacher() {
    }

    public Teacher(int id, String name, String date, String gender, String major) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", major='" + major + '\'' +
                '}';
    }
}

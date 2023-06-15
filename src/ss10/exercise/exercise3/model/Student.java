package ss10.exercise.exercise3.model;

public class Student extends Person {
    private String className;
    private int point;

    public Student(int id, String dateOfBirth, String name, boolean sex, String className, int point) {
        super(id, dateOfBirth, name, sex);
        this.className = className;
        this.point = point;
    }

    public Student(String className, int point) {
        this.className = className;
        this.point = point;
    }

    public Student(int id, String dateOfBirth, String name, boolean sex) {
        super(id, dateOfBirth, name, sex);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

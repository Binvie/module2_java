package mvc.model;

public class Student extends Person{
    private String className;
    private int point;

    public Student() {
    }
    public Student(int id, String name, String date, String className, int point) {
        super(id, name, date);
        this.className = className;
        this.point = point;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", className='" + className + '\'' +
                ", point=" + point +
                '}';
    }
}

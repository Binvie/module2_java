package mvc.repository;

import mvc.model.Student;

import java.util.ArrayList;
import java.util.List;

import static mvc.view.run.sc;

public class StudentRepo implements IStudentRepo {
    public static List<Student> studentList = new ArrayList<>();

    static {
//        int id, String name, String date, String className, int point
        studentList.add(new Student(1, "thien", "C04", "123", 5));
        studentList.add(new Student(2, "thoi", "C04", "123", 5));
        studentList.add(new Student(3, "sang", "C04", "123", 5));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(int index) {
        String result;
        System.out.println(studentList.get(index));
        System.out.println("Enter yes to delete student");
        result = sc.nextLine().toLowerCase();
        if (result.equals("yes")){
            studentList.remove(index);
        }else System.out.println("cancel");
    }
    @Override
    public void display() {
        for (Student value : studentList) {
            System.out.println(value);
        }
    }

    @Override
    public int searchId(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                return i;
            }
        }return -1;
    }
}

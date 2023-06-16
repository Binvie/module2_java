package ss10.exercise.exercise4.repository;

import ss10.exercise.exercise4.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo implements IStudentRepo {
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Thien", true));
        studentList.add(new Student(2, "Thoi", false));
        studentList.add(new Student(3, "Sang", false));
        studentList.add(new Student(4, "Nguyen", false));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()){
                studentList.remove(i);
                break;
            }
        }
    }
    @Override
    public List<Student> display() {
        return studentList;
    }
}

package ss10.exercise.exercise4.repository;

import ss10.exercise.exercise4.model.Student;

import java.util.List;

public interface IStudentRepo {
    void add(Student student);

    void delete(int id);


    List<Student> display();
}

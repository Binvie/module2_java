package mvc.repository;

import mvc.model.Student;

public interface IStudentRepo {
    void add(Student student);
    void delete(int id);
    void display();
    int searchId(int idex);
}

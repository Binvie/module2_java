package mvc.service;

import mvc.model.Student;
import mvc.repository.StudentRepo;

import static mvc.view.run.sc;


public class StudentService implements IStudentService {
    StudentRepo studentRepo = new StudentRepo();

    @Override
    public void add() {
        System.out.println("Enter student's id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student's name :");
        String name = sc.nextLine();
        System.out.println("Enter student's date :");
        String date = sc.nextLine();
        System.out.println("Enter student's classname :");
        String classname = sc.nextLine();
        System.out.println("Enter student's point :");
        int point = Integer.parseInt(sc.nextLine());
        Student student = new Student(id, name, date, classname, point);
        studentRepo.add(student);
    }

    @Override
    public void delete() {
        System.out.println("Enter student's id that you wanna delete :");
        int id = Integer.parseInt(sc.nextLine());
        int index = studentRepo.searchId(id);
        if (index == -1){
            System.out.println("not available");
        }else  studentRepo.delete(index);
    }

    @Override
    public void display() {
        studentRepo.display();
    }
}

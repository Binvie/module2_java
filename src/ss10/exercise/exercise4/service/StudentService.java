package ss10.exercise.exercise4.service;

import ss10.exercise.exercise4.model.Student;
import ss10.exercise.exercise4.repository.StudentRepo;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private static StudentRepo studentRepo = new StudentRepo();

    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's Id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter student's name:");
        String name = sc.nextLine();
        System.out.println("Enter student's gender:");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        Student student = new Student(id, name, gender);
        studentRepo.add(student);
        studentRepo.display();
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's Id that you wanna delete :");
        int id = Integer.parseInt(sc.nextLine());
        studentRepo.delete(id);

    }

    @Override
    public void display() {
        List<Student> studentList = studentRepo.display();
        System.out.println(studentList);
    }
}

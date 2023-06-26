package trainning.service;

import trainning.controller.TeacherController;
import trainning.model.Teacher;
import trainning.repository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

import static trainning.repository.TeacherRepository.scanner;
import static trainning.repository.TeacherRepository.teacherList;

public class TeacherService implements ITeacherServices {
    TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void display() {
        // int id, String name, String date, Boolean gender, String major
        teacherRepository.display();
    }

    @Override
    public void addNew() {
        System.out.println("Enter teacher's id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter teacher's name : ");
        String name = scanner.nextLine();
        System.out.println("Enter teacher's date : ");
        String date = scanner.nextLine();
        System.out.println("Enter teacher's gender : (true = male, false = female) ");
        String gender = scanner.nextLine();
        System.out.println("Enter teacher's major : ");
        String major = scanner.nextLine();
        teacherList.add( new Teacher(id, name, date, gender, major));
        teacherRepository.addNew();
    }

    @Override
    public void Remove() {

    }
}

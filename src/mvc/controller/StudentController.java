package mvc.controller;

import mvc.service.StudentService;

import java.util.Scanner;

import static mvc.view.run.sc;

public class StudentController {
    StudentService studentService = new StudentService();

     public void showMenu() {
        boolean flag = true;
        do {
            System.out.println("Enter your choice :" +
                    "\n1. Add new student;" +
                    "\n2. Delete student" +
                    "\n3. Display list" +
                    "\n4. exit");

            int choice = Integer.parseInt(sc.nextLine());
            // alt enter
            switch (choice) {
                case 1:
                    System.out.println("-------- Add new student-----------");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("-------- Delete student-----------");
                    studentService.delete();
                    break;
                case 3:
                    System.out.println("-------- Display list ---------");
                    studentService.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (flag) ;
    }
}

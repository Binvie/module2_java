package ss10.exercise.exercise4.controller;

import ss10.exercise.exercise4.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private  StudentService studentService = new StudentService();


    public void showMenu(){
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" Enter your selection:" +
                    "\n1. Add new student;" +
                    "\n2. Delete student;" +
                    "\n3. Show student list;" +
                    "\n4. Exit ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println(" ------------- ADD STUDENT------------");
                    studentService.add();
                    break;
                case 2:
                    System.out.println("------------ DELETE STUDENT-------------");
                    studentService.delete();
                    break;
                case 3:
                    System.out.println("------------ SHOW STUDENT LIST -------------");
                    studentService.display();
                    break;
                case 4:
                    System.out.println("Exit;");
                    System.exit(0);
            }
        }while (flag);
    }
}

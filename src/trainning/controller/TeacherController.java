package trainning.controller;

import trainning.model.Teacher;
import trainning.service.TeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static trainning.repository.TeacherRepository.scanner;

public class TeacherController {
    TeacherService teacherService = new TeacherService();


    public void showMenu() {

        boolean flag = true;
        do {
            System.out.println("Teacher Management Program :" +
                    "\n1. Add new Teacher." +
                    "\n2. Delete Teacher." +
                    "\n3. Display Teacher list." +
                    "\n4. Exit.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("--------Add new Teacher--------");

                    break;
                case 2:
                    System.out.println("---------Delete Teacher --------");
                    break;
                case 3:
                    System.out.println("----------Display Teacher List------------");
                    teacherService.display();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (flag);
    }
}

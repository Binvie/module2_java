package ss10.exercise.exercise3.controller;

import java.util.Scanner;

public class StudentController {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Pick option : " +
                    "\n 1. Add new student or teacher;" +
                    "\n 2. Remove student or teacher" +
                    "\n 3. View the list" +
                    "\n 4. Exit");
            int n = sc.nextInt();
            switch (n){
                case 1:

                case 2:
                case 3:
                case 4:
                default:
                    System.out.println("Try again");
            }


        }while (true);
    }
}

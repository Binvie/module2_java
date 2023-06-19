package mvc.view;

import mvc.controller.StudentController;
import mvc.service.StudentService;

import java.util.Scanner;

public class run {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}


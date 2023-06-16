package ss10.exercise.exercise4.view;

import ss10.exercise.exercise4.controller.StudentController;

public class Run {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showMenu();
    }
}

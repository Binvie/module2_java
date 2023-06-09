package ss2.practice;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Draw a triangle");
            System.out.println("1. Draw a square");
            System.out.println("1. Draw a rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                }
                break;
                case 2 : {
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                }
                break;
                case 3 : {
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                }
                break;
                case 0 : System.exit(0);
                default : System.out.println("No choice!");
            }
        }
    }
}

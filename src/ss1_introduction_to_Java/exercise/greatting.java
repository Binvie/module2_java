package ss1.exercise;

import java.util.Scanner;

public class greatting {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner greet = new Scanner(System.in);
        String name = greet.nextLine();
        System.out.println("Hello :" + name);
    }
}

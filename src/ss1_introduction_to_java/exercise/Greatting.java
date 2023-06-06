package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Greatting {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner greet = new Scanner(System.in);
        String name = greet.nextLine();
        System.out.println("Hello :" + name);
    }
}

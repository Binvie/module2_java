package ss3.exercise;

import java.util.Scanner;

public class AppearTimesOfElement {
    public static void main(String[] args) {
        String arr = "Hello em";
        System.out.println("Enter element you want to count :");
        Scanner sc = new Scanner(System.in);
        char word = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (word == arr.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

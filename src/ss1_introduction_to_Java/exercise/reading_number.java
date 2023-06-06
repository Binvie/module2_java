package ss1.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class reading_number {
    public static void main(String[] args) {
        System.out.println("Enter the number you wanna read :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] str1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] str10 = {"ten", "eleven", "twelve", "thirdteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] str20 = {"twenty", "thirdty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety", "one hundred"};
        if (number < 10) {
            System.out.println(str1[number]);
        } else if (number < 20) {
            System.out.println(str10[number - 10]);
        } else if (number <= 100) {
            System.out.println(str20[(number / 10) - 2] + str1[number % 10]);
        } else if (number < 1000) {
            int a = number / 100;
            int b = number % 100;
            int c = number % 10;
            if (c != 0) {
                System.out.println(str1[a] + " hundred and " + str20[b - 1] + str1[c]);
            }
        }
    }
}

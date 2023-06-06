package ss2.exercise;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Input number of prime number you wanna show:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int countNumber = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (countNumber < number) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(i);
                countNumber++;
            }
            count = 0;
        }

    }
}


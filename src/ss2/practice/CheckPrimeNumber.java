package ss2.practice;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner number = new Scanner(System.in);
        int check = number.nextInt();
        int count = 0;
        for (int i = 1; i <= check; i++) {
            if (check % i == 0) {
                count++;
            }
        }if (count == 2){
            System.out.println(check + " is a prime number ");
        }else {
            System.out.println(check + " is not a prime number ");
        }
    }
}

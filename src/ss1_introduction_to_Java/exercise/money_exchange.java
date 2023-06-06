package ss1.exercise;

import java.util.Scanner;

public class money_exchange {
    public static void main(String[] args) {
        double usd;
        double vnd = 23000;
        System.out.println("Enter your money, you wanna exchange :");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Your money is : " +exchange);
    }
}

package ss2.practice;

import java.util.Scanner;

public class CalculateInvestMoney {
    public static void main(String[] args) {
        double money, interest_rate;
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money for investment : ");
        money = sc.nextDouble();
        System.out.println("Enter number of months : ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate : ");
        interest_rate = sc.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interest_rate / 100) / 12;
        }
        System.out.println(totalInterest);
    }
}

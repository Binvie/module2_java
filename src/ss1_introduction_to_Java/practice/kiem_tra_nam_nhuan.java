package ss1.practice;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        System.out.println("Input the year you wanna know :");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println(year + " is a leap year");
                }else {
                    System.out.println(year + " is not a leap year");
                }
            }else {
                System.out.println(year + " is not a leap year");
            }
        }else {
            System.out.println(year + "is not a leap year");
        }
//        boolean isLeapYear = false;
//        boolean isDivisibleBy4 = year % 4 == 0;
//        if (isDivisibleBy4){
//            boolean isDivisibleBy100 = year % 100 == 0;
//            if (isDivisibleBy100){
//                boolean isDivisibleBy400 = year % 400 == 0;
//                if (isDivisibleBy400){
//                    isLeapYear = true;
//                }
//            }else {
//                isLeapYear = true;
//            }
//        }
//        if (isLeapYear){
//            System.out.println(year + " is a leap year");
//        }else {
//            System.out.println(year + " is not a leap year");
//        }
    }
}

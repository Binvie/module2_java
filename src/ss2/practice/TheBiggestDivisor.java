package ss2.practice;

import java.util.Scanner;

public class TheBiggestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter b :");
        int b = Integer.parseInt(sc.nextLine());

        a = Math.abs(a);
        b = Math.abs(b);

//        if (a = 0 && b = 0) {
//            System.out.println("There is no greatest common factor");
//        }
//        while (a != b) {
//            if (a > b)
//                a = a - b;
//            else a = b - a;
//        }
    }
}

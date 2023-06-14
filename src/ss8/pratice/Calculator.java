package ss8.pratice;

import java.util.Scanner;

public class Calculator {
    public static final String ADDITION = "+";
    public static final String SUBTRACTION = "-";
    public static final String DIVISION = "/";
    public static final String MULTIPLICATION = "*";

    public static int calculate(int a, int b, String o) {
        switch (o) {
            case ADDITION:
                return a + b;
            case SUBTRACTION:
                return a - b;
            case MULTIPLICATION:
                return a * b;
            case DIVISION:
                if (b == 0) {
                    throw new RuntimeException("cant not divide by 0");
                } else {
                    return a / b;
                }
            default:
                throw new IllegalStateException("Unexpected value: " + o);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a :");
        int a = sc.nextInt();

        System.out.println("Enter number b :");
        int b = sc.nextInt();

        System.out.println("Enter operator :");
        String o = sc.nextLine();
        calculate(a, b, o);
    }
}


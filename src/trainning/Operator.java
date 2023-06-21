package trainning;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b :");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Input operator : (*, -, /, +)");
        String string = scanner.nextLine();
        switch (string) {
            case "+":
                plus(a, b);
                break;
            case "-":
                minus(a, b);
                break;
            case "/":
                devide(a, b);
                break;
            case "*":
                time(a, b);
                break;
            default:
                System.out.println("Not available");
                break;
        }
    }

    public static void plus(double a, double b) {
        System.out.println(a + b);
    }

    public static void minus(double a, double b) {
        System.out.println(a - b);
    }

    public static void devide(double a, double b) {
        if (b == 0) {
            System.out.println("Not available");
        }
        System.out.println(a / b);
    }

    public static void time(double a, double b) {
        System.out.println(a * b);
    }
}

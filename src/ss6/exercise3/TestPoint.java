package ss6.exercise3;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x :");
        float x = sc.nextFloat();

        System.out.println("Enter y :");
        float y = sc.nextFloat();

        Point point = new Point(x, y);
        System.out.println(point);
    }
}


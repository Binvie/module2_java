package ss6.exercise3;

import java.util.Scanner;

public class TestMovablePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        float x = sc.nextFloat();

        System.out.println("Enter y:");
        float y = sc.nextFloat();

        System.out.println("Enter xSpeed:");
        float xSpeed = sc.nextFloat();

        System.out.println("Enter ySpeed:");
        float ySpeed = sc.nextFloat();

        MovablePoint movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
        System.out.println(movablePoint);
    }
}

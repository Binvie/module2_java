package ss4.exercise;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    double delta;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return delta = 2 * b - 4 * a * c;

    }

    public double getRoot1() {
        return (-b + Math.pow((b * b) - 4 * a * c, 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow((b * b) - 4 * a * c, 0.5)) / (2 * a);
    }

    public String getSolution() {
        if (getDiscriminant() > 0) {
            return "Equation has 2 roots : root1 = " + getRoot1() + "\n root2 = " + getRoot2();
        } else if (getDiscriminant() < 0) {
            return "Equation has 0 root";
        } else return "Equation has 1 root : root = " + -(b / (2 * a));
    }

    public static void main(String[] args) {
        System.out.println("Enter a :");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Enter b :");
        double b = sc.nextDouble();
        System.out.println("Enter c :");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        System.out.println(quadraticEquation.getSolution());
    }
}


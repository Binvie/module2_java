package ss7.exercise;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percent :");
        double percent = sc.nextDouble();

        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        shapes[0] = new Circle(radius);
        System.out.println(shapes[0]);
        System.out.println(shapes[0].getArea());
        System.out.println(((Circle)shapes[0]).reSize(percent));

        System.out.println("Enter side");
        double side = sc.nextDouble();
        shapes[1] = new Square(side);
        System.out.println(shapes[1]);
        System.out.println(((Square)shapes[1]).reSize(percent));

        System.out.println("Enter width :");
        System.out.println("Enter Length :");
        double width = sc.nextDouble();
        double length = sc.nextDouble();
        shapes[2] = new Rectangle(width,length);
        System.out.println(shapes[2]);
        System.out.println(shapes[2].getArea());
        System.out.println(((Rectangle)shapes[2]).reSize(percent));
    }
}

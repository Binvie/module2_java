package ss7.exercise;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter percent :");
        double percent = sc.nextDouble();

        shapes[0] = new Circle(6);
        shapes[1] = new Rectangle(20, 40);
        shapes[2] = new Square(15);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.println("the area of the circle is " + shapes[i].getArea());
            }
            if (shapes[i] instanceof Rectangle) {
                System.out.println("the area of the rectangle is " + shapes[i].getArea());
            }
            if (shapes[i] instanceof Square) {
                System.out.println("the area of the square is " + shapes[i].getArea());
            }
        }
    }
}

package ss7.exercise2;

import ss7.exercise.Circle;
import ss7.exercise.Rectangle;
import ss7.exercise.Shape;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];


        System.out.println("Enter side :");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        shape[1] = new ss7.exercise.Square(side);
        System.out.println(shape[1]);

        Square square = new Square(side);
        System.out.println(square);
        System.out.println("Enter percent :");
        double percent = sc.nextDouble();

        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        shape[0] = new Circle(radius);
        System.out.println(shape[0]);
        System.out.println(shape[0].getArea());

        System.out.println("Enter width :");
        System.out.println("Enter Length :");
        double width = sc.nextDouble();
        double length = sc.nextDouble();
        shape[2] = new Rectangle(width,length);
        System.out.println(shape[2]);

        for(Shape value : shape){
            if (value instanceof Colorable){
                System.out.println(((Colorable) value).howToColor());
            }else {
                System.out.println(value.getArea());
            }
        }
    }
}

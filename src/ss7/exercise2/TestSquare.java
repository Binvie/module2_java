package ss7.exercise2;

import ss7.exercise.Circle;
import ss7.exercise.Rectangle;
import ss7.exercise.Shape;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Circle(6);
        shape[1] = new ss7.exercise.Square(5);
        shape[2] = new Rectangle(5,10);

        for(Shape value : shape){
            if (value instanceof Colorable){
                System.out.println(((Colorable) value).howToColor());
            }else {
                System.out.println(value.getArea());
            }
        }
    }
}

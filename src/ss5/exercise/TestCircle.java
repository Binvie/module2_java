package ss5.exercise;

import ss5.exercise.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());

        Circle circle1 = new Circle(6);
        System.out.println(circle1.getArea() + " area: " + circle.getArea());
    }
}

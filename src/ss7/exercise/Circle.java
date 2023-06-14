package ss7.exercise;

import ss7.exercise2.Colorable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }
    public double reSize(double percent) {
        return getArea() + (percent / 100)*getArea();
    }
    public double getPerimeter(){
        return 4;
    }
}

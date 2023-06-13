package ss7.exercise2;

import ss7.exercise.Resizeable;
import ss7.exercise.Shape;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    @Override
    public double getArea() {
        return 0;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                " side = " + side + '\n' +
                '}';
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}



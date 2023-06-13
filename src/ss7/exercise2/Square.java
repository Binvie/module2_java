package ss7.exercise2;

import ss7.exercise.Resizeable;

public class Square implements Colorable {
    private double side;

    public Square() {
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
                " side = " + side + '\n' + howToColor() +
                '}';
    }

    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}



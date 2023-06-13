package ss7.exercise;

public class Square extends Shape implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
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
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    @Override
    public double reSize(double percent) {
        return getArea() + (percent / 100)*getArea();
    }
}

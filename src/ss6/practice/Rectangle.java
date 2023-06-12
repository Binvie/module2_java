package ss6.practice;

public abstract class Rectangle extends Shape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String name, boolean filled) {
    }

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Shape rectangle = new Shape();
        System.out.println(rectangle);

        rectangle = new Shape();
        System.out.println(rectangle);
        rectangle = new Shape(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

    }
}


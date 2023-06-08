package ss4.pratice;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
    public double getPerimeter(){
        return (height + width) * 2;
    }
    public String display(){
        return "Rectangle { height = " + height + " width = " + width + "}";
    }

    public static void main(String[] args) {
        System.out.println("Enter height :");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        System.out.println("Enter width :");
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("your " + rectangle.display());
        System.out.println("Area of the rectangle : " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle : " + rectangle.getPerimeter());

    }
}

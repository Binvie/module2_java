package ss4.exercise;

import java.sql.SQLOutput;

public class FanState {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    int speed = 1;
    boolean on = false;
    double radius = 5;

    String color = "blue";

    public FanState() {
    }

    public FanState(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (on) {
            return "FanState{" +
                    " speed=" + speed +
                    ", on=" + "on" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "FanState{" +
                    " speed=" + speed +
                    ", on=" + "off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        }

    }

    public static void main(String[] args) {
        FanState fanState = new FanState(3, "on".isEmpty(), 10, "red");
        FanState fanState1 = new FanState();
        FanState fanState2 = new FanState(2, "off".isEmpty(), 5, "yellow");
        System.out.println(fanState.toString());
        System.out.println(fanState2.toString());
        System.out.println(fanState1.toString());


    }
}

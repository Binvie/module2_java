package ss4.exercise;

import java.util.Scanner;

public class StopWatch {
    long startTime = 0;
    long stopTime = 0;
    boolean running = false;

    public StopWatch() {
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.running = running;
    }

    @Override
    public String toString() {
        return "StopWatch{" +
                "startTime=" + startTime +
                ", stopTime=" + stopTime +
                ", running=" + running +
                '}';
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }


    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = System.currentTimeMillis() - startTime;
        } else {
            elapsed = stopTime - startTime;
        }
        return elapsed;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 10000; j++) {
                for (int k = 0; k < 10000; k++) {
                    int a = k * 2;
                }
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}


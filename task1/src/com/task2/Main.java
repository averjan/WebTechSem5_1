package com.task2;

public class Main {
    public static void main(String[] args) {
        double x = 5, y = 1;
        System.out.println(isInArea(x, y));
    }

    private static boolean isInArea(double x, double y) {
        return (Math.abs(y - 1) <= 4)
                    && (((y <= 0) && (Math.abs(x) <= 6)) || ((y > 0) && (Math.abs(x) <= 4)));
    }
}

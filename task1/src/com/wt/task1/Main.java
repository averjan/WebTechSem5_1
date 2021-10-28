package com.wt.task1;

public class Main {

    public static void main(String[] args) {
        double x = 12.03;
        double y = -4.12;
        System.out.println(calculateFunction(x, y));
    }

    private static double calculateFunction(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2))
                / (2 + Math.abs(x - 2 * x / (1 + x * x * y * y)))
                * x;
    }
}

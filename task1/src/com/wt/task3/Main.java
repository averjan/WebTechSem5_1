package com.wt.task3;

public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = 10;
        double h = 0.5;
        calcFunction(a, b, h);
    }

    private static void calcFunction(double a, double b, double h) {
        System.out.println("\tx\t\t\tf(x)");
        double x = a;
        while (x <= b) {
            System.out.printf("\t%f\t%f%n", x, Math.tan(x));
            x += h;
        }
    }
}

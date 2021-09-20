package com.task3;

public class Main {
    public static void main(String[] args) {
        calcFunction(2, 10, 0.5);
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

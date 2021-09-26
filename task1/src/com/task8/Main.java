package com.task8;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] { 2, 12, 15, 40 };
        int[] b = new int[] { 1, 22, 34 };
        printPlaces(a, b);
    }

    private static void printPlaces(int[] a, int[] b) {
        int i = 0;
        for (int bEl : b) {
            while (i < a.length) {
                if (bEl <= a[i]) {
                    break;
                }

                System.out.printf("%d ", a[i]);
                i++;
            }

            System.out.printf("%d(from b) ", bEl);
        }
        
        while (i < a.length) {
            System.out.printf("%d ", a[i]);
            i++;
        }
    }
}

package com.task6;

import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        int[][] m = createMatrix(a);
        printMatrix(m);
    }

    private static int[][] createMatrix(int[] a) {
        int[][] m = new int[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                m[i][j] = a[(j + i) % a.length];
            }
        }

        return m;
    }

    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int el : row) {
                System.out.printf("%d ", el);
            }

            System.out.println();
        }
    }
}

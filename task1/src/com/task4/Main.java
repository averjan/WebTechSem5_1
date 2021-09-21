package com.task4;

public class Main {

    private static final int N = 5;

    public static void main(String[] args) {
        int[] ar = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < ar.length; i++) {
            if (isPrime(ar[i])) {
                System.out.println(i);
            }
        }
    }


    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

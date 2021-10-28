package com.wt.task4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] ar = new int[] { 1, 2, 3, 4, 5 };
        int[] primeNumbersIndexes;
        if ((primeNumbersIndexes = getPrimeNumbersIndexes(ar)).length > 0) {
            for (int i = 0; i < primeNumbersIndexes.length; i++) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Has no prime numbers");
        }
    }

    private static int[] getPrimeNumbersIndexes(int[] ar) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            if (isPrime(ar[i])) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
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

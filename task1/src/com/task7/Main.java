package com.task7;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] { 4 ,5, 63, 234, 12, 2, 0, -5, 12, 99 };
        shellSort(a);

        for (int el : a) {
            System.out.println(el);
        }
    }

    private static void shellSort(int[] a) {
        int len = a.length;
        for (int gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                }

                a[j] = temp;
            }
        }
    }
}

package com.task5;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] {2, 3, 12, 4, 15, 5, 0, -2, -4, 40};
        System.out.println(findRemoveNumber(a));
    }

    private static int findRemoveNumber(int[] a) {
        if (a == null) {
            return -1;
        }

        int[] d = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            d[i] = 1;
            for (int j = 0; j < i; ++j) {
                if (a[j] < a[i]) {
                    d[i] = Math.max(d[i], 1 + d[j]);
                }
            }
        }

        int ans = d[0];
        for (int i = 0; i < a.length; i++) {
            ans = Math.max(ans, d[i]);
        }

        return a.length - ans;
    }
}

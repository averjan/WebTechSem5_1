package com.task12.standarts;

import java.util.Arrays;
import java.util.Comparator;

public class ISBN {
    private final String isbn;

    public ISBN(String isbn) throws IllegalArgumentException {
        if (isValid(isbn)) {
            this.isbn = isbn;
        }
        else {
            throw new IllegalArgumentException(isbn);
        }
    }

    public String getIsbn() {
        return this.isbn;
    }

    public static boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        byte[] isbnBytes = new byte[s.length()];
        for (int i = 0; i < isbnBytes.length; i++) {
            byte c = (byte)s.charAt(i);
            if ((c < '0') || c > ('9')) {
                return false;
            }

            isbnBytes[i] = (byte) (c - (byte)'0');
        }

        int sum = 0;
        if(isbnBytes.length == 10) {
            for(int i = 0; i < 10; i++) {
                sum += (10 - i) * isbnBytes[i];
            }

            return sum % 11 == 0;
        } else if(isbnBytes.length == 13) {

            for(int i = 0; i < 12; i++) {
                if(i % 2 == 0) {
                    sum += isbnBytes[i];
                } else {
                    sum += isbnBytes[i] * 3;
                }
            }

            return isbnBytes[12] == 10 - (sum % 10);
        }

        return false;
    }

    public static int compare(ISBN isbn1, ISBN isbn2) {
        return isbn1.isbn.compareTo(isbn2.isbn);
    }

    @Override
    public String toString() {
        return String.format("%s", this.isbn);
    }
}

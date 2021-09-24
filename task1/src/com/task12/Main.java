package com.task12;

import com.task12.book.Book;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("The captain's daughter", "Pushkin", 3);
        Book book2 = new Book("The captain's daughter", "Pushkin", 3);
        Book book3 = new Book("War and Piece", "Tolstoy", 10);
        System.out.println(book.equals(book));
        System.out.println(book.equals(12));
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
        System.out.println(book.toString());
        System.out.println(book.hashCode());
    }
}

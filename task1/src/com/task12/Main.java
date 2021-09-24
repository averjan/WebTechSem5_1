package com.task12;

import com.task12.book.Book;
import com.task12.book.ProgrammerBook;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("The captain's daughter", "Pushkin", 3);
        Book book2 = new Book("The captain's daughter", "Pushkin", 3);
        Book book3 = new Book("War and Piece", "Tolstoy", 10);
        System.out.println(book.equals(book));
        System.out.println(book.equals(12));
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
        System.out.println(book.toString());
        System.out.println(book.hashCode());

        Book test = book.clone();
        System.out.println(test.toString());

        ProgrammerBook pb = new ProgrammerBook("The captain's daughter", "Pushkin", 3, "Spanish", 5);
        ProgrammerBook pb2 = new ProgrammerBook("The captain's daughter", "Pushkin", 3, "Spanish", 5);
        ProgrammerBook pb3 = new ProgrammerBook("War and Piece", "Tolstoy", 10, "Russian", 4);
        System.out.println(pb.equals(pb));
        System.out.println(pb.equals(12));
        System.out.println(pb.equals(pb2));
        System.out.println(pb.equals(pb3));
        System.out.println(pb.toString());
        System.out.println(pb.hashCode());
    }
}

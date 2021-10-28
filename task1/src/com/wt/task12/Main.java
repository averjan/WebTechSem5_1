package com.wt.task12;

import com.wt.task12.book.Book;
import com.wt.task12.book.ProgrammerBook;
import com.wt.task12.book.comparators.BookAuthorComparator;
import com.wt.task12.book.comparators.BookNameComparator;
import com.wt.task12.book.comparators.BookPriceComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("The captain's daughter", "Pushkin",
                             "9992158107", 4);
        Book book2 = new Book("The captain's daughter", "Pushkin",
                              "9971502100", 3);
        Book book3 = new Book("War and Piece", "Tolstoy",
                              "0306406152", 10);
        Book book4 = new Book("War and Piece", "Author",
                              "0306406152", 10);
        System.out.println(book.equals(book));
        System.out.println(book.equals(12));
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
        System.out.println(book.toString());
        System.out.println(book.hashCode());

        Book test = book.clone();
        System.out.println(test.toString());

        testProgrammerBook();

        List<Book> books = Arrays.asList(book, book2, book3, book4);
        testDefaultSort(books);
        testComparators(books);
    }

    private static void testProgrammerBook() {
        ProgrammerBook pb = new ProgrammerBook("The captain's daughter",
                                                "Pushkin", "9992158107",
                                                3,"Spanish", 5);
        ProgrammerBook pb2 = new ProgrammerBook("The captain's daughter",
                                                "Pushkin", "9971502100",
                                                3, "Spanish", 5);
        ProgrammerBook pb3 = new ProgrammerBook("War and Piece",
                                                "Tolstoy", "9604250590",
                                                10, "Russian", 4);
        System.out.println(pb.equals(pb));
        System.out.println(pb.equals(12));
        System.out.println(pb.equals(pb2));
        System.out.println(pb.equals(pb3));
        System.out.println(pb.toString());
        System.out.println(pb.hashCode());
    }

    private static void testDefaultSort(List<Book> books) {
        Collections.sort(books);
        System.out.println("Sorted:");
        for (Book el : books) {
            System.out.println(el.toString());
        }
    }

    private static void testComparators(List<Book> books) {
        Comparator<Book> comparator1 = new BookNameComparator();
        testSortWithComparator(comparator1, books);

        Comparator<Book> comparator2 = new BookNameComparator()
                .thenComparing(new BookAuthorComparator());
        testSortWithComparator(comparator2, books);

        Comparator<Book> comparator3 = new BookAuthorComparator();
        testSortWithComparator(comparator3, books);

        Comparator<Book> comparator4 = new BookAuthorComparator()
                .thenComparing(new BookNameComparator());
        testSortWithComparator(comparator4, books);

        Comparator<Book> comparator5 = new BookAuthorComparator()
                .thenComparing(new BookNameComparator())
                .thenComparing(new BookPriceComparator());
        testSortWithComparator(comparator5, books);
    }

    private static void testSortWithComparator(Comparator<Book> comparator, List<Book> list) {
        list.sort(comparator);
        System.out.println("Sorted:");
        for (Book el : list) {
            System.out.println(el.toString());
        }
    }
}

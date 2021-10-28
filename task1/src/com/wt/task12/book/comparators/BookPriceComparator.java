package com.wt.task12.book.comparators;

import com.wt.task12.book.Book;

import java.util.Comparator;

public class BookPriceComparator  implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1 == o2) {
            return 0;
        }

        if (o1 == null) {
            return -1;
        }

        if (o2 == null) {
            return 1;
        }

        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}

package com.task12.book;

import com.task12.standarts.ISBN;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private ISBN isbn;
    private static int edition = 12;

    public Book(String title, String author, String isbn, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = new ISBN(isbn);
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) {
            return true;
        }

        if (anotherObject instanceof Book) {
            return (this.title.equals(((Book) anotherObject).title))
                    && (this.author.equals(((Book) anotherObject).author))
                    && (this.price == ((Book) anotherObject).price)
                    && (ISBN.compare(this.isbn, ((Book) anotherObject).isbn) == 0);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.price, edition, this.isbn);
    }

    @Override
    public String toString() {
        return String.format("%s by %s, %d$, %d edition, ISBN: %s",
                this.title,
                this.author,
                this.price,
                edition,
                this.isbn.toString());
    }

    @Override
    public Book clone() throws CloneNotSupportedException {
        return new Book(this.title, this.author, this.isbn.getIsbn(), this.price);
    }

    @Override
    public int compareTo(Book o) {
        if (o == null) {
            return 1;
        }

        return ISBN.compare(this.isbn, o.isbn);
    }
}

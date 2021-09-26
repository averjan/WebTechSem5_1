package com.task12.book;

import com.task12.standarts.ISBN;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book>{
    private final String title;
    private final String author;
    private final int price;
    private final ISBN isbn;
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

        if (anotherObject instanceof Book bObject) {
            return (this.title.equals(bObject.title))
                    && (this.author.equals(bObject.author))
                    && (this.price == bObject.price)
                    && (ISBN.compare(this.isbn, bObject.isbn) == 0);
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
        return new Book(this.title, this.author, this.isbn.getIsbn(),
                        this.price);
    }

    @Override
    public int compareTo(Book o) {
        if (o == null) {
            return 1;
        }

        return ISBN.compare(this.isbn, o.isbn);
    }
}

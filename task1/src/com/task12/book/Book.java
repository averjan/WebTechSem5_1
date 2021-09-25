package com.task12.book;

import com.task12.standarts.ISBN;

public class Book implements Cloneable, Comparable<Book> {
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
        int prime = 31;
        int result = 1;
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.author == null) ? 0 : this.author.hashCode());
        result = prime * result + price;
        result = prime * result + edition;
        result = prime * result + this.isbn.hashCode();
        return result;
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
        return (Book) super.clone();
    }

    @Override
    public int compareTo(Book o) {
        return ISBN.compare(this.isbn, o.isbn);
    }
}

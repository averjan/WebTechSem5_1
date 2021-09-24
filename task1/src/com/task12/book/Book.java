package com.task12.book;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) {
            return true;
        }

        if (anotherObject instanceof Book) {
            return (this.title.equals(((Book) anotherObject).title))
                    && (this.author.equals(((Book) anotherObject).author))
                    && (this.price == ((Book) anotherObject).price);
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
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s by %s, %d$, %d edition", this.title, this.author, this.price, edition);
    }
}

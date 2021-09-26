package com.task12.book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, String isbn, int price, String language, int level) {
        super(title, author, isbn, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) {
            return true;
        }

        if (anotherObject instanceof ProgrammerBook) {
            return super.equals(anotherObject)
                    && (this.language.equals(((ProgrammerBook) anotherObject).language))
                    && (this.level == ((ProgrammerBook) anotherObject).level);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.language, this.level);
    }

    @Override
    public String toString() {
        return String.format("%s, language - %s, level - %d", super.toString(), this.language, this.level);
    }
}

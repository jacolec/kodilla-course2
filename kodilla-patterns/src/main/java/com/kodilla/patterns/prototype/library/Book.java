package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

public final class Book {

    final String author;
    final String title;
    final LocalDate publicationDate;

    public Book(final String author, final String title, final LocalDate publicationDate) {
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}

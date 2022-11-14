package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book bookFromA: bookSet) {
            com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book bookFromB = new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                    bookFromA.getAuthor(), bookFromA.getTitle(), bookFromA.getPublicationYear()
            );
            books.put(new BookSignature(bookFromA.getSignature()), bookFromB);
        }
        return medianPublicationYear(books);
    }
}

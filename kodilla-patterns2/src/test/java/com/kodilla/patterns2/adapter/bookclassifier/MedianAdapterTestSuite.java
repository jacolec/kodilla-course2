package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        Book dumaKey = new Book("Stephen King", "Duma key", 2008, "S1");
        Book trhlina = new Book("Josef Karika", "Trhlina", 2017, "S2");
        Book dejaDead = new Book("Kathy Reichs", "Deja dead", 1999, "S3");
        Book manitou = new Book("Graham Masterton", "Manitou", 1975, "S4");
        Book doberman = new Book("Jacek Piekielko", "Doberman", 2021, "S5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(dumaKey);
        bookSet.add(trhlina);
        bookSet.add(dejaDead);
        bookSet.add(manitou);
        bookSet.add(doberman);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println("The median of publication year is: " + median);
        Assertions.assertEquals(2008, median);


    }
}

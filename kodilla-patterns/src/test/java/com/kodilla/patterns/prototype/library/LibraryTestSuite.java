package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("Stephen King", "Duma key", LocalDate.of(2008, 1, 22));
        Book book2 = new Book("Cixin Liu", "The three-body problem", LocalDate.of(2017, 3, 14));
        Book book3 = new Book("Jozef Karika", "Trhlina", LocalDate.of(2017, 1, 1));

        Library library = new Library("Library number 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        Assertions.assertEquals(3, library.getBooks().size());
        Assertions.assertEquals(3, clonedLibrary.getBooks().size());
        Assertions.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}

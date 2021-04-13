package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Janek Wiśniewski","Black Rock",2006,"06"));
        books.add(new Book("Roman Pawlak","Tango",2007,"05"));
        books.add(new Book("Kamil Morawski","Little Princes",2003,"04"));
        books.add(new Book("Jarosław Kowalski","Big Apple",2001,"03"));
        books.add(new Book("Damian Stanisławski","Night",2002,"02"));
        //When
        int medianPublicationYear = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(2003,medianPublicationYear);
    }
}

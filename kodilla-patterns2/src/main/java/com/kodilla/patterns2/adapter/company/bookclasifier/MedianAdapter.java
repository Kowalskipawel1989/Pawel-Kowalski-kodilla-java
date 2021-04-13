package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookSignature;

import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet == null || bookSet.isEmpty()) {
            throw new IllegalArgumentException("The set is empty");
        }
        return medianPublicationYear(bookSet.stream()
                .collect(Collectors.toMap(MedianAdapter::toSignature, MedianAdapter::libraryA)));
    }
    private static com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book libraryA(Book book) {
        return new com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book(
                book.getAuthor(), book.getTitle(), book.getPublicationYear());
    }
    private static BookSignature toSignature(Book book) {
        return new BookSignature(book.getSignature());
    }
}

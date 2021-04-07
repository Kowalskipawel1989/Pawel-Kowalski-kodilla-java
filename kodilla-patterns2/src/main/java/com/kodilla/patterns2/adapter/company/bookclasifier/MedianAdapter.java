package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Classifier;

import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        return 0;
    }
}

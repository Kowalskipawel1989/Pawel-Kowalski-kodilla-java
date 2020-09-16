package com.kodilla.testing.library;


import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;



import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOfNoBooksOnLoan(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListBook = new ArrayList<>();
        LibraryUser user = new LibraryUser("Mario", "Jeans", "131452215151");
        when(libraryDatabase.listBooksInHandsOf(user)).thenReturn(resultListBook);
        //When
        List<Book> theListOfBook = bookLibrary.listBooksInHandOf(user);
        //Then
        Assert.assertEquals(0,theListOfBook);
    }
    @Test
    public void testListBooksInHandsOfHasOneOnLoan(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListBook = new ArrayList<>();

        LibraryUser user = new LibraryUser("Pablo", "Novak", "13124515151");
        Book book0 = new Book("Donald", "  Graham Artur",2000);
        resultListBook.add(book0);
        when(libraryDatabase.listBooksInHandsOf(user)).thenReturn(resultListBook);
        //When
        List<Book> theListOfBook = bookLibrary.listBooksInHandOf(user);
        //Then
        Assert.assertEquals(1,theListOfBook);

    }
    @Test
    public void testListBooksInHandsOfHasFiveOnLoan(){
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListBook = new ArrayList<>();
        LibraryUser user = new LibraryUser("Roger", "Markov", "213143515151");
        Book book0 = new Book("Teddy", "Kowalski Pablo",2000);
        Book book1 = new Book("Gold", "Nowak Martin",2011);
        Book book2 = new Book("War in", "Smith Artur",2012);
        Book book3 = new Book("Secret", "Jones Roger",2016);
        Book book4 = new Book("100 lat", "William Steve",2005);
        resultListBook.add(book0);
        resultListBook.add(book1);
        resultListBook.add(book2);
        resultListBook.add(book3);
        resultListBook.add(book4);
        when(libraryDatabase.listBooksInHandsOf(user)).thenReturn(resultListBook);
        //When
        List<Book> theListOfBook = bookLibrary.listBooksInHandOf(user);

        //Then
        Assert.assertEquals(5,theListOfBook);

    }
}

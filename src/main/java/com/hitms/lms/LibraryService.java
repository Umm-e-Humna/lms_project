package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides basic library book management operations.
 */
public class LibraryService {

    private final List<String> availableBooks = new ArrayList<>();
    private final List<String> issuedBooks = new ArrayList<>();

    /**
     * Adds a book to the library.
     *
     * @param book the title of the book
     */
    public void addBook(String book) {
        availableBooks.add(book);
        System.out.println(book + " added to library.");
    }

    /**
     * Issues a book if it is available.
     *
     * @param book the title of the book
     */
    public void issueBook(String book) {
        if (availableBooks.remove(book)) {
            issuedBooks.add(book);
            System.out.println(book + " issued successfully.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    /**
     * Returns an issued book to the library.
     *
     * @param book the title of the book
     */
    public void returnBook(String book) {
        if (issuedBooks.remove(book)) {
            availableBooks.add(book);
            System.out.println(book + " returned successfully.");
        } else {
            System.out.println(book + " was not issued.");
        }
    }
}
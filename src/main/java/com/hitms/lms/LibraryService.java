package com.hitms.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private final List<String> availableBooks = new ArrayList<>();
    private final List<String> issuedBooks = new ArrayList<>();

    public void addBook(String book) {
        availableBooks.add(book);
        System.out.println(book + " added to library.");
    }

    public void issueBook(String book) {
        if (availableBooks.remove(book)) {
            issuedBooks.add(book);
            System.out.println(book + " issued successfully.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    public void returnBook(String book) {
        if (issuedBooks.remove(book)) {
            availableBooks.add(book);
            System.out.println(book + " returned successfully.");
        } else {
            System.out.println(book + " was not issued.");
        }
    }
}
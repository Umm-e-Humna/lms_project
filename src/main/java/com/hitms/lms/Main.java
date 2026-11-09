package com.hitms.lms;

public class Main {

    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        library.addBook("Java Programming");
        library.addBook("Python Basics");

        library.issueBook("Java Programming");

        library.returnBook("Java Programming");
    }
}
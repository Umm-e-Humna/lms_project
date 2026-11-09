package com.hitms.lms;

public class LibraryIssueDemo {

    public static int issueBook(int copies, String title)
            throws BookUnavailableException {

        if (copies <= 0) {
            throw new BookUnavailableException(
                    "'" + title + "' has no copies available."
            );
        }

        return copies - 1;
    }

    public static void main(String[] args) {
        try {
            System.out.println(
                    "Remaining copies: " + issueBook(3, "Clean Code")
            );

            issueBook(0, "Clean Code");

        } catch (BookUnavailableException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
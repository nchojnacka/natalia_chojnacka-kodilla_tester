package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();
        Book book = bookManager.createBook("Clean Code", "Robert C. Martin");
        Book book1 = bookManager.createBook("Lord of the rings", "J. R. R. Tolkien");
        Book book2 = bookManager.createBook("Potęga podświadomości", "Joseph Murray");
        bookManager.createBook("Potęga podświadomości", "Joseph Murray");

        bookManager.displayBooks();
    }
}

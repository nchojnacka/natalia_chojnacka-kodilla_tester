package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {

    public Book createBook(String title, String author) {
        Book createBook = new Book(title, author);
        books.add(createBook);
        return createBook;
    }

    private Set<Book> books = new HashSet<>();

    public void displayBooks() {
        System.out.println(books);
    }
}

package com.graphqljava.tutorial.bookDetails.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {

    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }
    
    private static List<Book> books = Arrays.asList(
            new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
            new Book("book-2", "Moby Dick", 635, "author-2"),
            new Book("book-3", "Interview with the vampire", 371, "author-3")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static Book getByName(String name) {
        return books.stream().filter(book -> book.getName().equals(name)).findFirst().orElse(null);
    }

    public static List<Book> getByAuthorId(Author author) {
        return books.stream().filter(book -> book.getAuthorId().equals(author.getId())).collect(Collectors.toList());
    }

    public static List<Book> findAll(){
        return books;
    }

    public String getAuthorId() {
        return authorId;
    }
}
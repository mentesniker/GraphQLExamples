package com.graphqljava.tutorial.bookDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.graphqljava.tutorial.bookDetails.Data.Author;
import com.graphqljava.tutorial.bookDetails.Data.Authors;
import com.graphqljava.tutorial.bookDetails.Data.Book;

@Controller
public class BookController {

    public Authors authors;

    public BookController(Authors authors){
        this.authors = authors;
    }

    @QueryMapping
    public Book bookByName(@Argument String name) {
        return Book.getByName(name);
    }

    @QueryMapping
    public List<Book> booksByAuthors(@Argument Author author){
        return Book.getByAuthorId(author);
    }

    @MutationMapping
    public int putAuthor(@Argument Author author){
        System.out.println("foooo");
        System.out.println(author.getId());
        return authors.insert(author);
    }

    @SchemaMapping
    public Author author(Book book) {
        return authors.getById(book.getAuthorId());
    }

    @SchemaMapping(typeName = "Query",value = "allBooks")
    public List<Book> findAll() {
        return Book.findAll();
    }
}
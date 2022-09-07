package com.graphqljava.tutorial.bookDetails.Data;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Authors {
    public List<Author> authors;

    public Authors(){
        this.authors = new LinkedList<>();
        this.authors.add(new Author("author-1", "Joanne", "Rowling"));
        this.authors.add(new Author("author-2", "Herman", "Melville"));
        this.authors.add(new Author("author-3", "Anne", "Rice"));
    }

    public Author getById(String id) {
        return this.authors.stream().filter(author -> author.getId().equals(id)).findFirst().orElse(null);
    }

    public int insert(Author author){
        System.out.println(author.getId());
        this.authors.add(author);
        return 1;
    }
}

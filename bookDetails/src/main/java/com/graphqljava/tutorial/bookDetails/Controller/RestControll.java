package com.graphqljava.tutorial.bookDetails.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.graphqljava.tutorial.bookDetails.Data.Author;
import com.graphqljava.tutorial.bookDetails.Data.Authors;


@RestController
@RequestMapping( value = "/faa")
public class RestControll {

    Authors authors;

    public RestControll(Authors authors){
        this.authors = authors;
    }

    @GetMapping(path  = "/foo",
    produces = "application/json; charset=utf-8")
    public List<Author> MiMethodo(){
        return authors.authors;
    }
}

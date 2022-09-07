package com.graphqljava.tutorial.bookDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.graphqljava.tutorial.bookDetails.Data.Authors;

@SpringBootApplication
public class BookDetailsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BookDetailsApplication.class, args);
	}

}

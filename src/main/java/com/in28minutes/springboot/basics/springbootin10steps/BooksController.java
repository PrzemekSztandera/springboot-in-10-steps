package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {

        return Arrays.asList(
                new Book(1l, "Mastering Spring 5.5", "Ranga Karana"),
                new Book(2l, "Lord of the Ring", "J. R. R Tolkien"),
                new Book(3l, "Hobbit", "J. R. R Tolkien")
        );
    }
}

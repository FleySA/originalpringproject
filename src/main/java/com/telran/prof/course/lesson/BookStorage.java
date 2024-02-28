package com.telran.prof.course.lesson;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Component
public class BookStorage {
    Map<String, Book> storage = new HashMap<>();

    @PostConstruct
    public void init() {
    List<Book> books = Arrays.asList(
            new Book("Harry Potter", "J.K","History", 1950),
            new Book("Lord of the Ring", "J.R", "Fantasy", 1450),
            new Book("The Hobbit", "J.R", "Fantasy", 1970)
    );
    books.forEach(book -> storage.put(book.getName(), book));
    }
    public Map<String, Book> getStorage() {
        return storage;
    }
@PreDestroy
    public void destroy() {
        storage.clear();
    }
}

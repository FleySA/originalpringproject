package com.telran.prof.course.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Component //authorFilter
public class AuthorFilter implements  Filter{
  //  @Autowired
    private BookStorage storage ;
    @Autowired // Constructor injection (@Autowired optional)
    public AuthorFilter(BookStorage storage) {
        this.storage = storage;
      }
@Override
    public List<Book> getBook(String filterParam) {
        List<Book> bookList = new ArrayList<>();
        Map<String, Book> storage = this.storage.getStorage();
        storage.forEach(((bookName,book) -> {
            if (book.getAuthor().equalsIgnoreCase(filterParam)){
                bookList.add(book);
            }
        }));
        return bookList;
    }

    @Override
    public boolean canFilter(int type) {
        return 2 == type;
    }
}

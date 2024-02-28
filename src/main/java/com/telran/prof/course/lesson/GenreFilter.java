package com.telran.prof.course.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Component // genreFilter
public class GenreFilter implements Filter{
    @Autowired
    private BookStorage storage ;
    @Override
    public List<Book> getBook(String filterParam) {
        List<Book> bookList = new ArrayList<>();
        Map<String, Book> storage = this.storage.getStorage();
        storage.forEach(((bookName,book) -> {
            if (book.getGenre().equalsIgnoreCase(filterParam)){
                bookList.add(book);
            }
        }));
        return bookList;
    }

    @Override
    public boolean canFilter(int type) {
        return 3 == type;
    }
}

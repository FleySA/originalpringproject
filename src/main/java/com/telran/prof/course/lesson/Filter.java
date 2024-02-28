package com.telran.prof.course.lesson;

import java.util.List;

public interface Filter {
     List<Book> getBook(String filterParam);

     boolean canFilter(int type);
}

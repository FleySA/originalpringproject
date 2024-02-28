package com.telran.prof.course.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class RecommendationCreator {
    @Autowired // Field injection (Autowiring By type) - процесс связывания springom наших объектов по полю(типу)
   // @Qualifier("nameFilter")
    private Filter authorFilter; // Authowiring by name -> name bean == name field

    @Autowired
    private Filter nameFilter;

    @Autowired
    private Filter genreFilter;

    public List<Book> getBook(String filterParam, int type) {
        Filter filter = null;
        switch (type) {
            case 1 :
                filter = nameFilter;
                break;
            case 2 :
                filter = authorFilter;
                break;
            case 3 :
                filter = genreFilter;
            default:
        }

        return filter.getBook(filterParam);
    }
}

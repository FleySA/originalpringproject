package com.telran.prof.course.lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class RecommendationCreatorV2 {
    @Autowired
    private List<Filter> filterList = Collections.emptyList();

    public List<Book> getBook(String filterParam, int type) {
        for (Filter filter : filterList) {
            if (filter.canFilter(type)) {
                return filter.getBook(filterParam);
            }
        }


        return new ArrayList<>();
    }
}

package com.telran.prof.course.lesson;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

     //   BookStorage bookStorage = new BookStorage();
     //   AuthorFilter authorFilter = new AuthorFilter(bookStorage);
     //   RecommendationCreator creator = new RecommendationCreator(authorFilter);

        RecommendationCreatorV2 creator = context.getBean("recommendationCreatorV2", RecommendationCreatorV2.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print input filter type (1-name, 2-author, 3-genre, 4-year)");
        int type = scanner.nextInt();
        System.out.println("Print input filter: ");
        String filter = new Scanner(System.in).nextLine();

        List<Book> book = creator.getBook(filter, type);
        System.out.println("Book list by filter:");
        book.forEach(System.out::println);

         context.close();
    }
}

package com.telran.prof.course.lesson;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int year;

    public Book(String name, String author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }



    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}

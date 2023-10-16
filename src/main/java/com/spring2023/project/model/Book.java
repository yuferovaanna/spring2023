package com.spring2023.project.model;

import lombok.Getter;

@Getter
public class Book {
    private long id;
    private String title;
    private String author;
    private double price;
    private BookGenre genre;
    public Book(long id, String title, String author, double price, BookGenre genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this. genre = genre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}

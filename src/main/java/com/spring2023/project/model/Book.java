package com.spring2023.project.model;

import lombok.Getter;

// Книга
@Getter
public class Book {
    private long id; // id книги
    private String title; // название
    private String author; // автор
    private double price; // цена
    private BookGenre genre; // жанр
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

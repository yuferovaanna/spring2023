package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;

// Книга
@Getter
@Table(name="BOOKS")
public class Book {
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id; // id книги

    @Column(name="title")
    private String title; // название

    @Column(name="author")
    private String author; // автор

    @Column(name="price")
    private double price; // цена

    @Column(name="genre")
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

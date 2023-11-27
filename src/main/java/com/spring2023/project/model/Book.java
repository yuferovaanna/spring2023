package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

/** Книга */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="BOOKS")
public class Book {
    /** Id книги */
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;
    /** Название книги */
    @Column(name="title")
    private String title; // название
    /** Автор книги */
    @Column(name="author")
    private String author; //
    /** Цена */
    @Column(name="price")
    private double price; //
    /** Жанр */
    @Column(name="genre")
    private BookGenre genre; // жанр

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

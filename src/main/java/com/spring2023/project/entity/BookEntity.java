package com.spring2023.project.entity;

import com.spring2023.project.model.Book;
import com.spring2023.project.model.BookGenre;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

/** Сущность книги */
@Entity
@Getter
@Setter
@Table(name="BOOKS")
public class BookEntity {
    /** Id книги */
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;
    /** Название книги */
    @Column(name="title")
    private String title;
    /** Автор книги */
    @Column(name="author")
    private String author;
    /** Цена */
    @Column(name="price")
    private double price;
    /** Жанр */
    @Column(name="genre")
    private BookGenre genre;

    public BookEntity(){
    }
    public static Book toModel(BookEntity bookEntity) {
        Book model = new Book();
        model.setId(bookEntity.getId());
        model.setTitle(bookEntity.getTitle());
        model.setAuthor(bookEntity.getAuthor());
        model.setPrice(bookEntity.getPrice());
        model.setGenre(bookEntity.getGenre());
        return model;

    }

}

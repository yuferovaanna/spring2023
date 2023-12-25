package com.spring2023.project.model;

import lombok.Getter;
import lombok.Setter;

/** Книга */
@Setter
@Getter
public class Book {
    /** Id книги */
    private long id;
    /** Название книги */
    private String title;
    /** Автор книги */
    private String author;
    /** Цена */
    private double price;
    /** Жанр */
    private BookGenre genre;

    public Book(){
    }
}

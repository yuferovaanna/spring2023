package com.spring2023.project.model;

import lombok.Getter;
import lombok.Setter;

/** Автор */
@Getter
@Setter
public class Author {
    /** id автора */
    private long id;
    /** Имя автора */
    private String name;
    /** Фамилия автора */
    private String surname;

    public Author(){
    }
}

package com.spring2023.project.model;

import lombok.Getter;
import lombok.Setter;

/** Пользователь */
@Setter
@Getter
public class Person {
    /** Id пользователя */
    private long id;
    /** Логин */
    private String login;
    /** Имя пользователя */
    private String personName;

    public Person() {
    }
}


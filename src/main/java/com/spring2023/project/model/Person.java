package com.spring2023.project.model;

import lombok.Getter;

/* Пользователь */
@Getter
public abstract class Person {
    private long id; // индивидуальный номер пользователя
    @lombok.Setter
    private String name; // имя
    private int age; // возраст
    private final String email; // почта
    private String password; // пароль

    public Person(long id, String name, int age, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* Замена имени
     * Параметр: Новое имя
     */
    public void changeName(String newName){
        if(!newName.isEmpty())
            name=newName;
    }

    /* Замена пароля
     * Параметр: Новый пароль
     */
    public void changePassword(String newPassword){
        if(!newPassword.isEmpty())
            password=newPassword;
    }

}


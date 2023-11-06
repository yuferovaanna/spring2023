package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;

/* Пользователь */
@Getter
@Table(name="ACCOUNTS")
public abstract class Person {
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id; // индивидуальный номер пользователя
    @lombok.Setter

    @Column(name="person_name")
    private String name; // имя

    @Column(name="person_age")
    private int age; // возраст

    @Column(name="person_email")
    private final String email; // почта

    @Column(name="person_password")
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


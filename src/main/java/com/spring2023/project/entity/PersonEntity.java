package com.spring2023.project.entity;

import com.spring2023.project.model.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/** Сущность пользователя */
@Entity
@Getter
@Setter
@Table(name="ACCOUNTS")
public class PersonEntity {
    /** Id пользователя */
    @Id
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;
    /** Логин */
    @Column(name="login")
    private String login;
    /** Имя пользователя */
    @Column(name="person_name")
    private String personName;
    /** Фамилия пользователя */
    @Column(name="person_surname")
    private String personSurname;
    /** Возраст пользователя */
    @Column(name="person_age")
    private int age;
    /** Почта */
    @Column(name="person_email")
    private String email;
    /** Пароль */
    @Column(name="person_password")
    private String password;

    public PersonEntity() {
    }

    public static Person toModel(PersonEntity entity) {
        Person model = new Person();
        model.setId(entity.getId());
        model.setLogin(entity.getLogin());
        return model;
    }

    /** Замена пароля
     * Параметр: Новый пароль
     */
    public void changePassword(String newPassword){
        if(!newPassword.isEmpty())
            password=newPassword;
    }

}



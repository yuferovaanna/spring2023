package com.spring2023.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/* Пользователь */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="ACCOUNTS")
public class Person {
    @Id
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id; // индивидуальный номер пользователя
    @lombok.Setter

    @Column(name="person_name")
    private String name; // имя

    @Column(name="person_surname")
    private String surname; // фамилия

    @Column(name="person_age")
    private int age; // возраст

    @Column(name="person_email")
    private final String email; // почта

    @Column(name="person_password")
    private String password; // пароль

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


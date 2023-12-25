package com.spring2023.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/** Сущность автора */
@Entity
@Getter
@Setter
@Table(name="AUTHOR")
public class AuthorEntity {
    /** id автора */
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;
    /** Имя автора */
    @Column(name="name")
    private String name;
    /** Фамилия автора */
    @Column(name="surname")
    private String surname;
    /** Дата рождения */
    @Column(name="dateOfBirth")
    private int dateOfBirth;
    /** Дата смерти автора */
    @Column(name="dateOfDeath")
    private int dateOfDeath;

    public AuthorEntity(){
    }
}

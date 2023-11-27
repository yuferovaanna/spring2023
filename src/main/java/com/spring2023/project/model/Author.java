package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

/** Автор */
@Getter
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="AUTHORS")
public class Author {
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


    public Author(Long id, String name, String surname,  int dateOfBirth, int dateOfDeath) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }
}

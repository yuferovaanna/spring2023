package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="AUTHORS")
public class Author {
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id; // id автора
    @Column(name="name")
    private String name; // имя автора
    @Column(name="surname")
    private String surname; // фамилия автора
    @Column(name="dateOfBirth")
    private int dateOfBirth; // Дата рождения
    @Column(name="dateOfDeath")
    private int dateOfDeath; // дата смерти автора


    public Author(Long id, String name, String surname,  int dateOfBirth, int dateOfDeath) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }
}

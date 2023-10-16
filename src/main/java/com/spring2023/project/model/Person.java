package com.spring2023.project.model;

import lombok.Getter;

@Getter
public class Person {
    private long id;
    @lombok.Setter
    private String name;
    private int age;

    public Person(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;

    }

    public void setAge(int age) {
        this.age = age;
    }
}


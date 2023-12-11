package com.spring2023.project.exception.Person;

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String message) {
        super(message);
    }

    public PersonNotFoundException() {
        super("Пользователя с таким именем не существует");
    }
}

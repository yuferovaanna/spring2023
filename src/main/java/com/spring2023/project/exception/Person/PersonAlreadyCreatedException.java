package com.spring2023.project.exception.Person;

public class PersonAlreadyCreatedException extends Exception {
    public PersonAlreadyCreatedException(String message) {
        super(message);
    }

    public PersonAlreadyCreatedException() {
        super("Пользователя с таким именем уже создавали");
    }
}

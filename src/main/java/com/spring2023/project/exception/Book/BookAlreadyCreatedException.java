package com.spring2023.project.exception.Book;

public class BookAlreadyCreatedException extends Exception{
    public BookAlreadyCreatedException(String message) {
        super(message);
    }

    public BookAlreadyCreatedException() {
        super("Данная книга уже существует");
    }
}

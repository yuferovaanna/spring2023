package com.spring2023.project.exception.Book;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String message) {
        super(message);
    }

    public BookNotFoundException() {
        super("Данной книги нет");
    }
}

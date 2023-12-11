package com.spring2023.project.exception.Person;

public class LoginFailedException extends Exception{
    public LoginFailedException() {
        super("Неверное написано имя пользователя или пароль");
    }
}

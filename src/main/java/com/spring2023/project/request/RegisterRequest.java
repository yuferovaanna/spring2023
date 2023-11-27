package com.spring2023.project.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/** Регистрация */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    /** Логин */
    private String login;
    /** Почта */
    private String email;
    /** Пароль */
    private String password;
    /** Имя */
    private String name;
    /** Фамилия */
    private String surname;
    /** Возраст */
    private int age;

}

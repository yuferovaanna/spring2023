package com.spring2023.project.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String login; // логин
    private String email; // почта
    private String password; // пароль
    private String name; // имя
    private String surname; // фамилия
    private int age; // возраст

}

package com.spring2023.project.controller;

import com.spring2023.project.entity.PersonEntity;
import com.spring2023.project.exception.Person.LoginFailedException;
import com.spring2023.project.exception.Person.PersonAlreadyCreatedException;
import com.spring2023.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/registration")
    public ResponseEntity registration(@RequestBody PersonEntity person) {
        try {
            personService.registration(person);
            return ResponseEntity.ok("Пользователь был успешно сохранен");
        } catch (PersonAlreadyCreatedException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @GetMapping("/login")
    public ResponseEntity login(@RequestParam String login, @RequestParam String password) {
        try {
            return ResponseEntity.ok(PersonService.login(login, password));
        } catch (LoginFailedException e) {
            return ResponseEntity.status(401).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Произошла ошибка");
        }
    }
}

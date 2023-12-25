package com.spring2023.project.service;

import com.spring2023.project.exception.Person.LoginFailedException;
import com.spring2023.project.exception.Person.PersonAlreadyCreatedException;
import com.spring2023.project.exception.Person.PersonNotFoundException;
import com.spring2023.project.model.Person;
import com.spring2023.project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private BasketService basketService;
    public void registration(Person person) throws PersonAlreadyCreatedException,
            LoginFailedException, PersonNotFoundException {
    }
    public Person login(String username, String password) {
        return null;
    }
    public void logout() {

    }

}

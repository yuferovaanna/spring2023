package com.spring2023.project.service;

import com.spring2023.project.model.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {
    /**
     * Get Person from DataBase by ID
     * @param id - order ID to return
     * @return Person with specified ID or null if not found
     */
    Person findById(Long id);
    Person findByEmail(String email);
    Person save(Person person);

}

package com.spring2023.project.repository;

import com.spring2023.project.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByPersonName(String personName);
}
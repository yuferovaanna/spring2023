package com.spring2023.project.repository;

import com.spring2023.project.model.Basket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends CrudRepository<Basket, Long> {
    Basket findByPersonEntity_Id(Long personEntity_Id);
}


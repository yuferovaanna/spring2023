package com.spring2023.project.repository;

import com.spring2023.project.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
    Iterable<OrderRepository> findAllByPersonEntity_Id(Long personEntity_Id);
}


package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

/** Сущность заказа */
@Entity
@Getter
@Setter
@Table(name="ORDERS")
public class OrderEntity {
    /** Id заказа */
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id;
    /** Кто продал книгу */
    @Column(name="employeeId")
    private long employeeId;
    /** Кто купил книгу */
    @Column(name="customerId")
    private long customerId;
    /** Cписок номеров купленных книг */
    @Column(name="order")
    private long[] books;

    public OrderEntity(){
    }

}


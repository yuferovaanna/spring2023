package com.spring2023.project.model;

import lombok.Getter;
import lombok.Setter;

/** Заказ */
@Setter
@Getter
public class Order {
    /** Id заказа */
    private long id;
    /** Кто продал книгу */
    private long employeeId;
    /** Кто купил книгу */
    private long customerId;
    /** Cписок номеров купленных книг */
    private long[] books;

    public Order(){
    }
}


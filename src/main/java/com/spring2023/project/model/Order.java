package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

/** Заказ */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="ORDERS")
public class Order {
    /** Id заказа */
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id; //
    /** Кто продал книгу */
    @Column(name="employeeId")
    private long employeeId; //
    /** Кто купил книгу */
    @Column(name="customerId")
    private long customerId; //
    /** Cписок номеров купленных книг */
    @Column(name="order")
    private long[] books; //


    public void setId(long id) {
        this.id = id;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }

}


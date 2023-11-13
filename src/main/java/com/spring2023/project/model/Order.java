package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.*;

/* Заказ */
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="ORDERS")
public class Order {
    @GeneratedValue
    @Column(name="id", nullable=false)
    private long id; // индивидуальный номер заказа

    @Column(name="employeeId")
    private long employeeId; // Кто продал книгу

    @Column(name="customerId")
    private long customerId; // Кто купил книгу

    @Column(name="order")
    private long[] books; // список номеров купленных книг


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


package com.spring2023.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Getter;

/* Заказ */
@Getter
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


    public Order(long id, long employeeTd, long customerId, long[] books) {
        this.id = id;
        this.employeeId = employeeTd;
        this.customerId = customerId;
        this.books = books;
    }

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

    /* Удаление книги из заказа

    public void deleteBook() {

    }
     */
    /* Завершение заказа

    public void closeOrder() {

    }
     */


}


package com.spring2023.project.model;

import lombok.Getter;

/* Заказ */
@Getter
public class Order {
    private long id; // индивидуальный номер заказа
    private long employeeId; // Кто продал книгу
    private long customerId; // Кто купил книгу
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


package com.spring2023.project.model;

import lombok.Getter;

@Getter
public class Order {
    private long id;
    private long employeeTd;
    private long customerId;
    private long[] books;


    public Order(long id, long employeeTd, long customerId, long[] books) {
        this.id = id;
        this.employeeTd = employeeTd;
        this.customerId = customerId;
        this.books = books;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEmployeeTd(long employeeTd) {
        this.employeeTd = employeeTd;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }
}

package com.spring2023.project.exception.Order;

public class OrderNotFoundException extends Exception{
    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException() {
        super("Заказ не найден");
    }
}

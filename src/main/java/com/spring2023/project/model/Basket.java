package com.spring2023.project.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Basket {
    /** Id корзины */
    private Long id;
    /** Id пользователя */
    private long personId;
    /** Продавец книги */
    private long employeeId;
    /** Cписок сохраненных книг */
    private long[] books;

    public Basket(){
    }
}

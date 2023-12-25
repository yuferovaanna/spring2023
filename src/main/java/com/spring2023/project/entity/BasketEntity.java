package com.spring2023.project.entity;

import com.spring2023.project.model.Basket;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/** Сущность корзины */
@Entity
@Getter
@Setter
@Table(name="BASKET")
public class BasketEntity {
    /** Id корзины */
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    /** Id пользователя */
    @Column(name="personId")
    private long personId;
    /** Продавец книги */
    @Column(name="employeeId")
    private long employeeId;
    /** Cписок сохраненных книг */
    @Column(name="book")
    private long[] books;

    public BasketEntity(){
    }

    public static Basket toModel(BasketEntity basketEntity) {
        Basket model = new Basket();
        model.setId(basketEntity.getId());
        model.setPersonId(basketEntity.getPersonId());
        return model;
    }
}

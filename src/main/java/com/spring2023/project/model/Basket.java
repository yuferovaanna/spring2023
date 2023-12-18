package com.spring2023.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
@Entity
@Table(name="BASKET")
public class Basket {
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
    private List[] books;
}
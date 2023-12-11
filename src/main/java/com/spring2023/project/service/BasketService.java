package com.spring2023.project.service;

import com.spring2023.project.model.Basket;
import org.springframework.stereotype.Service;

@Service
public interface BasketService {
    /**
     * Get Basket from DataBase by ID
     * @param id - Basket ID to return
     * @return Basket with specified ID or null if not found
     */
    Basket getBasketByID(long id);
}

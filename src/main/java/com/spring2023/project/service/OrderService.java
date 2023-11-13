package com.spring2023.project.service;

import com.spring2023.project.model.Order;
import com.spring2023.project.request.OrderRequest;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    /**
     * Create or update Order
     * @param order - existing or new Order
     * @return created or updated Order
     */
    Order createOrUpdateOrder(OrderRequest order);
    /**
     * Get Order from DataBase by ID
     * @param id - order ID to return
     * @return Order with specified ID or null if not found
     */
    Order getOrderByID(long id);
    /**
     * Delete order from DataBase
     * @param id - Order ID to delete
     */
    void deleteOrder(long id);
}

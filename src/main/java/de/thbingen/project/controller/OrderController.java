package de.thbingen.project.controller;

import de.thbingen.project.model.dto.OrderDTO;

import javax.validation.Valid;
import java.util.List;

public interface OrderController {
    OrderDTO createOrder(@Valid OrderDTO orderDto);

    List<OrderDTO> getAllOrders();

    OrderDTO getOrderById(Long id);

    OrderDTO updateOrder(Long id, @Valid OrderDTO orderDto);

    void deleteOrder(Long id);

    List<OrderDTO> getOrdersByUserId(Long userId);
}

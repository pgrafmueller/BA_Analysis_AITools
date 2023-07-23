package de.thbingen.project.controller;

import de.thbingen.project.model.dto.OrderDTO;

import javax.validation.Valid;

public interface OrderController {
    OrderDTO createOrder(@Valid OrderDTO orderDto);

    OrderDTO getOrderById(Long id);

    OrderDTO updateOrder(Long id, @Valid OrderDTO orderDto);

    void deleteOrder(Long id);

}

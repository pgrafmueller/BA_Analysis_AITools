package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);

    List<OrderDTO> getAllOrders();

    OrderDTO getOrderById(Long id);

    OrderDTO updateOrder(OrderDTO orderDTO);

    void deleteOrder(Long id);

    List<OrderDTO> getOrdersByUser(UserEntity userEntity);
}

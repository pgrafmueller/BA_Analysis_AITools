package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface OrderService {
    OrderEntity saveOrder(OrderDTO orderDTO);

    List<OrderEntity> getAllOrders();

    OrderEntity getOrderById(Long id);

    OrderEntity updateOrder(OrderDTO orderDTO);

    void deleteOrder(Long id);

    List<OrderEntity> getOrdersByUser(UserEntity userEntity);
}

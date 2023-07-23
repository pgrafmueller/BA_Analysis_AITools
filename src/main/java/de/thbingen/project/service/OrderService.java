package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface OrderService {

    List<OrderEntity> getAllOrders();

    OrderEntity getOrderById(Long id);


    void deleteOrder(Long id);

    List<OrderEntity> getOrdersByUser(UserEntity userEntity);
}

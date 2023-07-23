package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;
    private final OrderDTOtoOrderEntityMapper orderDTOtoOrderEntityMapper;
    private final OrderRepository orderRepository;


    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public OrderEntity getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<OrderEntity> getOrdersByUser(UserEntity userEntity) {
        return orderRepository.findAllByUser(userEntity);
    }
}

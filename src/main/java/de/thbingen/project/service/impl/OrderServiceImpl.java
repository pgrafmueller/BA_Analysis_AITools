package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.service.OrderService;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;
    private final OrderDTOtoOrderEntityMapper orderDTOtoOrderEntityMapper;
    private final OrderRepository orderRepository;

    //map the orderDTO to an orderEntity by using the mapper and save it in the database
    @Override
    public OrderEntity createOrder(OrderDTO orderDTO);

    //get all orders from the database and return them
    @Override
    public List<OrderEntity> getAllOrders();

    //get the order from the database by its id and return it
    @Override
    public OrderEntity getOrderById(Long id);

    //map the orderDTO to an orderEntity by using the mapper and update it in the database
    @Override
    public OrderEntity updateOrder(OrderDTO orderDTO);

    //delete the order from the database by its id
    @Override
    public void deleteOrder(Long id);

    //get all orders from the database with the given user and return them
    @Override
    public List<OrderEntity> getOrdersByUser(UserEntity userEntity);
}

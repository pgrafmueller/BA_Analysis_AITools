package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import de.thbingen.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDTOtoOrderEntityMapperImpl implements OrderDTOtoOrderEntityMapper {
    private final UserRepository userRepository;
    @Override
    public UserEntity mapUserIdToUserEntity(long userId){
        return userRepository.findById(userId).get();
    }
    @Override
    public OrderEntity mapOrderDTOToOrderEntity(OrderDTO orderDTO){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(orderDTO.getOrderId());
        orderEntity.setOrderDate(orderDTO.getOrderDate());
        orderEntity.setOrderStatus(orderDTO.getOrderStatus());
        orderEntity.setOrderTotal(orderDTO.getOrderTotal());
        orderEntity.setUser(mapUserIdToUserEntity(orderDTO.getUserId()));
        return orderEntity;
    }
}

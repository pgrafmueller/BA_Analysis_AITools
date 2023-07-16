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
    public UserEntity mapUserIdToUserEntity(long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public OrderEntity mapOrderDTOToOrderEntity(OrderDTO orderDTO) {
        return new OrderEntity(orderDTO.getId(),
                orderDTO.getItemName(),
                orderDTO.getAmount(),
                mapUserIdToUserEntity(orderDTO.getUserId()));
    }
}

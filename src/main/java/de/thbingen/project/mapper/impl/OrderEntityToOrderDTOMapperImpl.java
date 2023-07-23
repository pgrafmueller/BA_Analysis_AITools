package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderEntityToOrderDTOMapperImpl implements OrderEntityToOrderDTOMapper {
    private final OrderRepository orderRepository;

    @Override
    public long mapUserEntityToUserId(UserEntity userEntity) {
        return userEntity.getId();
    }

}

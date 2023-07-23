package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderEntityToOrderDTOMapperImpl implements OrderEntityToOrderDTOMapper {

    //read the user id from the user entity and return it
    @Override
    public long mapUserEntityToUserId(UserEntity userEntity) {
        return userEntity.getId();
    }

}

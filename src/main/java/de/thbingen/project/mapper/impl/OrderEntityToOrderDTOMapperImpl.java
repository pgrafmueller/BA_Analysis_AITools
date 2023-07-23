package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderEntityToOrderDTOMapperImpl implements OrderEntityToOrderDTOMapper {

    @Override
    public long mapUserEntityToUserId(UserEntity userEntity) {
        return userEntity.getId();
    }

}

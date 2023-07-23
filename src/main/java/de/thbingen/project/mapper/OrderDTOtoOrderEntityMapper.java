package de.thbingen.project.mapper;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;

public interface OrderDTOtoOrderEntityMapper {
    UserEntity mapUserIdToUserEntity(long userId);

}

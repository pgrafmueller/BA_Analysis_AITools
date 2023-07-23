package de.thbingen.project.service;


import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface FilterService {
    List<OrderEntity> filterOrdersByUser(UserEntity userEntity);
}

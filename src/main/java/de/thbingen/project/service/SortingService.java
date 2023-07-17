package de.thbingen.project.service;

import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface SortingService {
    List<UserEntity> sortUsersByName(List<UserEntity> users);

    //sort users alphabetically by email
    List<UserEntity> sortUsersByEmail(List<UserEntity> users);

    List<UserEntity> sortUsersByDateOfBirthAsc(List<UserEntity> users);
    List<UserEntity> sortUsersByDateOfBirthDesc(List<UserEntity> users);

    List<UserEntity> sortUsersByStreet(List<UserEntity> users);

    List<UserEntity> sortUsersByCity(List<UserEntity> users);

    List<UserEntity> sortUsersByState(List<UserEntity> users);

    List<UserEntity> sortUsersByZip(List<UserEntity> users);

    List<UserEntity> sortUsersByGender(List<UserEntity> users);

    List<RoleEntity> sortRolesByName(List<RoleEntity> roles);

    List<OrderEntity> sortOrdersByUserName(List<OrderEntity> orders);

    List<OrderEntity> sortOrdersByAmount(List<OrderEntity> orders);
}

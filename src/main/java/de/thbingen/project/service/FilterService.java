package de.thbingen.project.service;


import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface FilterService {
    List<UserEntity> filterUsersByFirstName(String firstName);

    List<UserEntity> filterUsersByCity(String city);

    List<UserEntity> filterUsersByGender(UserEntity.Gender gender);

    List<UserEntity> filterUsersByEmail(String email);

    List<UserEntity> filterUsersByPhoneNumber(String phoneNumber);

    List<UserEntity> filterUsersByRole(RoleEntity roleEntity);

    List<RoleEntity> filterRolesByName(String name);

    List<RoleEntity> filterRolesByUserCount(int minUserCount);

    List<OrderEntity> filterOrdersByAmountRange(double minAmount, double maxAmount);

    List<OrderEntity> filterOrdersByUser(UserEntity userEntity);
}

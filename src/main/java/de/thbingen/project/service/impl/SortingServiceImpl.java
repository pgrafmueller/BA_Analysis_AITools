package de.thbingen.project.service.impl;

import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.service.SortingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SortingServiceImpl implements SortingService {
    @Override
    public List<UserEntity> sortUsersByName(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByEmail(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByDateOfBirthAsc(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByDateOfBirthDesc(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByStreet(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByCity(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByState(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByZip(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByGender(List<UserEntity> users) {
        return users;
    }
    @Override
    public List<RoleEntity> sortRolesByName(List<RoleEntity> roles) {
        return roles;
    }
    @Override
    public List<OrderEntity> sortOrdersByUserName(List<OrderEntity> orders) {
        return orders;
    }
    @Override
    public List<OrderEntity> sortOrdersByAmount(List<OrderEntity> orders) {
        return orders;
    }
}

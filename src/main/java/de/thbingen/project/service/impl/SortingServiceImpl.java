package de.thbingen.project.service.impl;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
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
        users.sort((o1, o2) -> {
            if (o1.getLastName().compareTo(o2.getLastName()) == 0) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            } else {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return users;
    }

    @Override
    public List<UserEntity> sortUsersByEmail(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getEmail().compareTo(o2.getEmail()));
        return users;
    }

    @Override
    public List<UserEntity> sortUsersByDateOfBirthAsc(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getDateOfBirth().compareTo(o2.getDateOfBirth()));
        return users;
    }

    @Override
    public List<UserEntity> sortUsersByDateOfBirthDesc(List<UserEntity> users) {
        users.sort((o1, o2) -> o2.getDateOfBirth().compareTo(o1.getDateOfBirth()));
        return users;
    }

    @Override
    public List<UserEntity> sortUsersByStreet(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getAddress().getStreet().compareTo(o2.getAddress().getStreet()));
        return users;
    }

    @Override
    public List<UserEntity> sortUsersByCity(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getAddress().getCity().compareTo(o2.getAddress().getCity()));
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByState(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getAddress().getState().compareTo(o2.getAddress().getState()));
        return users;
    }
    @Override
    public List<UserEntity> sortUsersByZip(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getAddress().getZip().compareTo(o2.getAddress().getZip()));
        return users;
    }

    @Override
    public List<UserEntity> sortUsersByGender(List<UserEntity> users) {
        users.sort((o1, o2) -> o1.getGender().compareTo(o2.getGender()));
        return users;
    }

    @Override
    public List<RoleEntity> sortRolesByName(List<RoleEntity> roles) {
        roles.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return roles;
    }

    @Override
    public List<OrderEntity> sortOrdersByUserName(List<OrderEntity> orders) {
        orders.sort((o1, o2) -> o1.getUser().getLastName().compareTo(o2.getUser().getLastName()));
        return orders;
    }

    @Override
    public List<OrderEntity> sortOrdersByAmount(List<OrderEntity> orders) {
        orders.sort((o1, o2) -> o1.getAmount().compareTo(o2.getAmount()));
        return orders;
    }
}

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

    //sort users alphabetically by their last name then by their first name
    @Override
    public List<UserEntity> sortUsersByName(List<UserEntity> users) {
        return null;
    }

    //sort users alphabetically by email
    @Override
    public List<UserEntity> sortUsersByEmail(List<UserEntity> users) {
        return null;
    }

    //sort users by date of birth ascending
    @Override
    public List<UserEntity> sortUsersByDateOfBirthAsc(List<UserEntity> users) {
        return null;
    }

    //sort users by date of birth descending
    @Override
    public List<UserEntity> sortUsersByDateOfBirthDesc(List<UserEntity> users) {
        return null;
    }

    //sort users alphabetically by street in their address
    @Override
    public List<UserEntity> sortUsersByStreet(List<UserEntity> users) {
        return null;
    }

    //sort users alphabetically by city in their address
    @Override
    public List<UserEntity> sortUsersByCity(List<UserEntity> users) {
        return null;
    }

    //sort users by zip code in their address
    @Override
    public List<UserEntity> sortUsersByZip(List<UserEntity> users) {
        return null;
    }

    //sort users alphabetically by their gender
    @Override
    public List<UserEntity> sortUsersByGender(List<UserEntity> users) {
        return null;
    }

    //sort roles alphabetically by their name
    @Override
    public List<RoleEntity> sortRolesByName(List<RoleEntity> roles) {
        return null;
    }

    //sort orders alphabetically by the name of the user who placed the order
    @Override
    public List<OrderEntity> sortOrdersByUserName(List<OrderEntity> orders) {
        return null;
    }

    //sort orders by the amount of the order
    @Override
    public List<OrderEntity> sortOrdersByAmount(List<OrderEntity> orders) {
        return null;
    }
}

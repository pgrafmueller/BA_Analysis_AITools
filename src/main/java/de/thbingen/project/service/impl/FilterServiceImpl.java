package de.thbingen.project.service.impl;

import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.FilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FilterServiceImpl implements FilterService {

    @Override
    public List<UserEntity> filterUsersByFirstName(String firstName) {
        return null;
    }

    @Override
    public List<UserEntity> filterUsersByCity(String city) {
        return null;
    }

    @Override
    public List<UserEntity> filterUsersByGender(UserEntity.Gender gender) {
        return null;
    }

    @Override
    public List<UserEntity> filterUsersByEmail(String email) {
        return null;
    }

    @Override
    public List<UserEntity> filterUsersByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public List<UserEntity> filterUsersByRole(RoleEntity roleEntity) {
        return null;
    }

    @Override
    public List<RoleEntity> filterRolesByName(String name) {
        return null;
    }

    @Override
    public List<RoleEntity> filterRolesByUserCount(int minUserCount) {
        return null;
    }

    @Override
    public List<OrderEntity> filterOrdersByAmountRange(double minAmount, double maxAmount) {
        return null;
    }

    @Override
    public List<OrderEntity> filterOrdersByUser(UserEntity userEntity) {
        return null;
    }
}

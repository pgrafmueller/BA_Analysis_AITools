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
        private final UserRepository userRepository;
        private final RoleRepository roleRepository;
        private final OrderRepository orderRepository;

    @Override
    public List<UserEntity> filterUsersByFirstName(String firstName) {
        return userRepository.findAll().stream()
                .filter(userEntity -> userEntity.getFirstName().equals(firstName))
                .toList();
    }
    @Override
    public List<UserEntity> filterUsersByCity(String city) {
        return userRepository.findAll().stream()
                .filter(userEntity -> userEntity.getCity().equals(city))
                .toList();
    }

    @Override
    public List<UserEntity> filterUsersByGender(UserEntity.Gender gender) {

    }
    @Override
    public List<UserEntity> filterUsersByEmail(String email) {
        return userRepository.findAll().stream()
                .filter(userEntity -> userEntity.getEmail().equals(email))
                .toList();
    }
    @Override
    public List<UserEntity> filterUsersByPhoneNumber(String phoneNumber) {
        return userRepository.findAll().stream()
                .filter(userEntity -> userEntity.getPhoneNumber().equals(phoneNumber))
                .toList();
    }
    @Override
    public List<UserEntity> filterUsersByRole(RoleEntity roleEntity) {
        return userRepository.findAll().stream()
                .filter(userEntity -> userEntity.getRoles().contains(roleEntity))
                .toList();
    }
    @Override
    public List<RoleEntity> filterRolesByName(String name) {
        return roleRepository.findAll().stream()
                .filter(roleEntity -> roleEntity.getName().equals(name))
                .toList();
    }
    @Override
    public List<RoleEntity> filterRolesByUserCount(int minUserCount) {
        return roleRepository.findAll().stream()
                .filter(roleEntity -> roleEntity.getUsers().size() >= minUserCount)
                .toList();
    }
    @Override
    public List<OrderEntity> filterOrdersByAmountRange(double minAmount, double maxAmount) {
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getAmount() >= minAmount && orderEntity.getAmount() <= maxAmount)
                .toList();
    }
    @Override
    public List<OrderEntity> filterOrdersByUser(UserEntity userEntity) {
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getUser().equals(userEntity))
                .toList();
    }
}

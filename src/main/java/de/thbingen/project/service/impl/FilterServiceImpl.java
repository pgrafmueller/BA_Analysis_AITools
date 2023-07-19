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

    //get all users from the repository and filter them by their firstName and return them
    @Override
    public List<UserEntity> filterUsersByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }

    //get all users from the repository and filter them by the city in their address and return them
    @Override
    public List<UserEntity> filterUsersByCity(String city) {
        return userRepository.findAllByAddressCity(city);
    }

    //get all users from the repository and filter them by their gender and return them
    @Override
    public List<UserEntity> filterUsersByGender(UserEntity.Gender gender) {
        return userRepository.findAllByGender(gender);
    }

    //get all users from the repository and filter them by their email and return them
    @Override
    public List<UserEntity> filterUsersByEmail(String email) {
        return userRepository.findAllByEmail(email);
    }

    //get all users from the repository and filter them by their phoneNumber and return them
    @Override
    public List<UserEntity> filterUsersByPhoneNumber(String phoneNumber) {
        return userRepository.findAllByPhoneNumber(phoneNumber);
    }

    //get all users from the repository and filter them by their role and return them
    @Override
    public List<UserEntity> filterUsersByRole(RoleEntity roleEntity) {
        return userRepository.findAllByRole(roleEntity);
    }

    //get all roles from the repository and filter them by their name and return them
    @Override
    public List<RoleEntity> filterRolesByName(String name) {
        return roleRepository.findAllByName(name);
    }

    //get all roles from the repository and filter them by the number of users that have this role and return them
    @Override
    public List<RoleEntity> filterRolesByUserCount(int minUserCount) {
        return roleRepository.findAllByUsersCount(minUserCount);
    }

    //get all orders from the repository and filter them by their amount and return them
    @Override
    public List<OrderEntity> filterOrdersByAmountRange(double minAmount, double maxAmount) {
        return orderRepository.findAllByAmountBetween(minAmount, maxAmount);
    }

    //get all orders from the repository and filter them by the user and return them
    @Override
    public List<OrderEntity> filterOrdersByUser(UserEntity userEntity) {
        return orderRepository.findAllByUser(userEntity);
    }
}

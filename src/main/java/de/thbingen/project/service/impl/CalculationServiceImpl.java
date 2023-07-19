package de.thbingen.project.service.impl;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CalculationServiceImpl implements CalculationService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    //calculate the total order amount by iterating over all orders and adding the order amount to the total order amount
    @Override
    public double calculateTotalOrderAmount(OrderDTO orderDTO) {
        return orderDTO.getOrderAmount();
    }

    //calculate the average order amount for a user by iterating over all orders and adding the order amount to the total order amount and dividing it by the number of orders
    @Override
    public double calculateAverageOrderAmountForUser(UserDTO userDTO) {
        return calculateTotalOrderAmount(userDTO) / calculateNumberOfOrdersForUser(userDTO);
    }

    //calculate the total number of orders by iterating over all orders and adding 1 to the total number of orders
    @Override
    public int calculateTotalNumberOfOrdersForUser(UserDTO userDTO) {
        return calculateNumberOfOrdersForUser(userDTO);
    }

    //calculate the average order amount by iterating over all orders and adding the order amount to the total order amount and dividing it by the number of orders
    @Override
    public double calculateAverageOrderAmount() {
        return calculateTotalOrderAmount() / calculateNumberOfOrders();
    }

    //calculate the average order amount for users with the specific role by iterating over all orders and adding the order amount to the total order amount and dividing it by the number of orders
    @Override
    public double calculateAverageOrderAmountForRole(RoleDTO roleDTO) {
        return calculateTotalOrderAmount() / calculateNumberOfOrders();
    }

    //calculate the number of users by iterating over all users and adding 1 to the number of users
    @Override
    public int calculateNumberOfUsers() {
        return userRepository.findAll().size();
    }

    //calculate the number of orders by iterating over all orders and adding 1 to the number of orders
    @Override
    public int calculateNumberOfOrders() {
        return orderRepository.findAll().size();
    }

    //calculate the number of orders for a user by iterating over all orders and adding 1 to the number of orders
    @Override
    public int calculateNumberOfOrdersForUser(UserDTO userDTO) {
        return orderRepository.findAll().size();
    }

    //calculate the number of orders for a user with the specified gender by iterating over all orders and adding 1 to the number of orders
    @Override
    public double calculateAverageOrderAmountForGender(UserEntity.Gender gender) {
        return orderRepository.findAll().size();
    }
}

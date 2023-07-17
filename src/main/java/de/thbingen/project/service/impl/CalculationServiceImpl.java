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

    @Override
    public double calculateTotalOrderAmount(OrderDTO orderDTO) {
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getItemName().equals(orderDTO.getItemName()))
                .mapToDouble(orderEntity -> orderEntity.getAmount())
                .sum();
    }

    @Override
    public double calculateAverageOrderAmountForUser(UserDTO userDTO){
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getUser().getId() == userDTO.getId())
                .mapToDouble(orderEntity -> orderEntity.getAmount())
                .average()
                .orElse(0);
    }
    @Override
    public int calculateTotalNumberOfOrdersForUser(UserDTO userDTO){
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getUser().getId() == userDTO.getId())
                .mapToInt(orderEntity -> 1)
                .sum();
    }
    @Override
    public double calculateAverageOrderAmount(){
        return orderRepository.findAll().stream()
                .mapToDouble(orderEntity -> orderEntity.getAmount())
                .average()
                .orElse(0);
    }
    @Override
    public double calculateAverageOrderAmountForRole(RoleDTO roleDTO){
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getUser().getRole().getId() == roleDTO.getId())
                .mapToDouble(orderEntity -> orderEntity.getAmount())
                .average()
                .orElse(0);
    }
    @Override
    public int calculateNumberOfUsers(){
        return userRepository.findAll().stream()
                .mapToInt(userEntity -> 1)
                .sum();
    }
    @Override
    public int calculateNumberOfOrders(){
        return orderRepository.findAll().stream()
                .mapToInt(orderEntity -> 1)
                .sum();
    }
    @Override
    public int calculateNumberOfOrdersForUser(UserDTO userDTO){
        return orderRepository.findAll().stream()
                .filter(orderEntity -> orderEntity.getUser().getId() == userDTO.getId())
                .mapToInt(orderEntity -> 1)
                .sum();
    }
    @Override
    public double calculateAverageOrderAmountForGender(UserEntity.Gender gender) {
        
    }
}

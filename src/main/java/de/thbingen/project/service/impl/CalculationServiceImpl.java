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
        return orderDTO.getAmount() * orderDTO.getPrice();
    }
    @Override
    public double calculateAverageOrderAmountForUser(UserDTO userDTO) {
        return orderRepository.findAllByUser(userRepository.findById(userDTO.getId()).orElse(null))
                .stream()
                .mapToDouble(orderEntity -> orderEntity.getAmount() * orderEntity.getPrice())
                .average()
                .orElse(0);
    }
    @Override
    public int calculateTotalNumberOfOrdersForUser(UserDTO userDTO) {
        return orderRepository.findAllByUser(userRepository.findById(userDTO.getId()).orElse(null)).size();
    }
    @Override
    public double calculateAverageOrderAmount() {
        return orderRepository.findAll()
                .stream()
                .mapToDouble(orderEntity -> orderEntity.getAmount() * orderEntity.getPrice())
                .average()
                .orElse(0);
    }
    @Override
    public double calculateAverageOrderAmountForRole(RoleDTO roleDTO) {
        return orderRepository.findAllByUser_Role(roleRepository.findById(roleDTO.getId()).orElse(null))
                .stream()
                .mapToDouble(orderEntity -> orderEntity.getAmount() * orderEntity.getPrice())
                .average()
                .orElse(0);
    }
    @Override
    public int calculateNumberOfUsers() {
        return userRepository.findAll().size();
    }
    @Override
    public int calculateNumberOfOrders() {
        return orderRepository.findAll().size();
    }
    @Override
    public int calculateNumberOfOrdersForUser(UserDTO userDTO) {
        return orderRepository.findAllByUser(userRepository.findById(userDTO.getId()).orElse(null)).size();
    }
    @Override
    public double calculateAverageOrderAmountForGender(UserEntity.Gender gender) {
        
    }
}

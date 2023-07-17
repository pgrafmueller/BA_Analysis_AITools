package de.thbingen.project.service.impl;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.UserDTO;
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

    //accumulated amount of one orders of all users
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

}

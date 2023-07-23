package de.thbingen.project.service.impl;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public abstract class CalculationServiceImpl implements CalculationService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    @Override
    public int calculateTotalNumberOfOrdersForUser(UserDTO userDTO) {
        return orderRepository.findAllByUser(userRepository.findById(userDTO.getId()).orElse(null)).size();
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

}

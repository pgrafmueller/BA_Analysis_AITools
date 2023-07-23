package de.thbingen.project.service.impl;

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
    public int calculateNumberOfUsers() {
        return userRepository.findAll().size();
    }

    @Override
    public int calculateNumberOfOrders() {
        return orderRepository.findAll().size();
    }

}

package de.thbingen.project.service.impl;

import de.thbingen.project.model.entity.OrderEntity;
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


    //get all orders from the repository and filter them by the user and return them
    @Override
    public List<OrderEntity> filterOrdersByUser(UserEntity userEntity) {
        return orderRepository.findAllByUser(userEntity);
    }
}

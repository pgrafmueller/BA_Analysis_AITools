package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements RoleService {
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;
    private final OrderDTOtoOrderEntityMapper orderDTOtoOrderEntityMapper;
    private final OrderRepository orderRepository;
}

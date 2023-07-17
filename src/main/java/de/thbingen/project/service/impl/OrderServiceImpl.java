package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.service.OrderService;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;
    private final OrderDTOtoOrderEntityMapper orderDTOtoOrderEntityMapper;
    private final OrderRepository orderRepository;
    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(
                orderRepository.save(orderDTOtoOrderEntityMapper.mapOrderDTOToOrderEntity(orderDTO)));
    }

    @Override
    public List<OrderDTO> getAllOrders(){
        return orderEntityToOrderDTOMapper.mapOrderEntitiesToOrderDTOs(orderRepository.findAll());
    }
    @Override
    public OrderDTO getOrderById(Long id) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderRepository.findById(id).get());
    }
    @Override
    public OrderDTO updateOrder(OrderDTO orderDTO){
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(
                orderRepository.save(orderDTOtoOrderEntityMapper.mapOrderDTOToOrderEntity(orderDTO)));
    }
    @Override
    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
    @Override
    public List<OrderDTO> getOrdersByUser(UserEntity userEntity){
        return orderEntityToOrderDTOMapper.mapOrderEntitiesToOrderDTOs(orderRepository.findByUser(userEntity));
    }
}

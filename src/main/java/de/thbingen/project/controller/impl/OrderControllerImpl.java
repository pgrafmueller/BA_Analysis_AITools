package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.OrderController;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderControllerImpl implements OrderController {
    private final OrderService orderService;
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;
    @Override
    public OrderDTO createOrder(@Valid OrderDTO orderDto) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderService.saveOrder(orderDto));
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderService.getOrderById(id));
    }
    @Override
    public OrderDTO updateOrder(Long id, @Valid OrderDTO orderDto) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderService.updateOrder(orderDto));
    }
    @Override
    public void deleteOrder(Long id) {
        orderService.deleteOrder(id);
    }

}

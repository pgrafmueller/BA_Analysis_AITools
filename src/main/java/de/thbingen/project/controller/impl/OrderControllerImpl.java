package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.OrderController;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class OrderControllerImpl implements OrderController {
    private final OrderService orderService;
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;

    //call the orderService to save the order
    @Override
    public OrderDTO createOrder(@Valid OrderDTO orderDto) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderService.createOrder(orderDto));
    }


    //call the orderService to get the order by its id
    @Override
    public OrderDTO getOrderById(Long id) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderService.getOrderById(id));
    }

    //call the orderService to update the order
    @Override
    public OrderDTO updateOrder(Long id, @Valid OrderDTO orderDto) {
        return orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(orderService.updateOrder(orderDto));
    }

    //call the orderService to delete the order
    @Override
    public void deleteOrder(Long id) {
        orderService.deleteOrder(id);
    }


}

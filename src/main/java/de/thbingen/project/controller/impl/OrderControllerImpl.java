package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.OrderController;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.service.OrderService;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderControllerImpl implements OrderController {
    private final OrderService orderService;
    private final UserService userService;
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;

    //call the orderService to save the order
    @Override
    public OrderDTO createOrder(@Valid OrderDTO orderDto);

    //call the orderService to get all orders
    @Override
    public List<OrderDTO> getAllOrders();

    //call the orderService to get the order by its id
    @Override
    public OrderDTO getOrderById(Long id);

    //call the orderService to update the order
    @Override
    public OrderDTO updateOrder(Long id, @Valid OrderDTO orderDto);

    //call the orderService to delete the order
    @Override
    public void deleteOrder(Long id);

    //call the userService to get the user from the id
    //if the user is null return an empty list
    //if the user exists call the orderService to get all orders from the user
    @Override
    public List<OrderDTO> getOrdersByUserId(Long userId);
}

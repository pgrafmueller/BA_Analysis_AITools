package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.OrderController;
import de.thbingen.project.mapper.OrderEntityToOrderDTOMapper;
import de.thbingen.project.service.OrderService;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrderControllerImpl implements OrderController {
    private final OrderService orderService;
    private final UserService userService;
    private final OrderEntityToOrderDTOMapper orderEntityToOrderDTOMapper;


}

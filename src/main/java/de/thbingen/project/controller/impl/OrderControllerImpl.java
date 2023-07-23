package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.OrderController;
import de.thbingen.project.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class OrderControllerImpl implements OrderController {
    private final OrderService orderService;

    @Override
    public void deleteOrder(Long id) {
        orderService.deleteOrder(id);
    }

}

package de.thbingen.project.service.impl;

import de.thbingen.project.errorhandler.exception.GenericValidationException;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.service.OrderService;
import de.thbingen.project.service.RoleService;
import de.thbingen.project.service.UserService;
import de.thbingen.project.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ValidationServiceImpl implements ValidationService {
    private final UserService userService;
    private final OrderService orderService;
    private final RoleService roleService;

    @Override
    public void validateUserOrderCollaboration(UserDTO userDTO, OrderDTO orderDTO) throws GenericValidationException {
        if (!orderService.getOrdersByUser(userService.getUserById(userDTO.getId())).contains(orderService.getOrderById(orderDTO.getId()))) {
            throw new GenericValidationException("User and Order are not related");
        }
    }

    @Override
    public void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException {
        if (userService.getUserByEmail(userDTO.getEmail()) != null) {
            throw new GenericValidationException("User with this email already exists");
        }
    }
}

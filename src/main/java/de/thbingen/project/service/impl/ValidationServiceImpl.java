package de.thbingen.project.service.impl;

import de.thbingen.project.errorhandler.exception.GenericValidationException;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
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
    public void validateUserRoleCollaboration(UserDTO userDTO, RoleDTO roleDTO) throws GenericValidationException {
        if (!roleService.getRolesByUser(userService.getUserById(userDTO.getId())).contains(roleService.getRoleById(roleDTO.getId()))) {
            throw new GenericValidationException("User and Role are not related");
        }
    }
    @Override
    public void validateOrderUserExistence(OrderDTO orderDTO) throws GenericValidationException {
        if (userService.getUserById(orderDTO.getUser().getId()) == null) {
            throw new GenericValidationException("User does not exist");
        }
    }
    @Override
    public void validateRoleUserExistence(RoleDTO roleDTO) throws GenericValidationException {
        if (userService.getUserById(roleDTO.getUser().getId()) == null) {
            throw new GenericValidationException("User does not exist");
        }
    }
    @Override
    public void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException {
        if (userService.getUserByEmail(userDTO.getEmail()) != null) {
            throw new GenericValidationException("User with this email already exists");
        }
    }
    @Override
    public void validateUserUniquePhoneNumber(UserDTO userDTO) throws GenericValidationException {
        if (userService.getUserByPhoneNumber(userDTO.getPhoneNumber()) != null) {
            throw new GenericValidationException("User with this phone number already exists");
        }
    }
    @Override
    public void validateRoleUniqueName(RoleDTO roleDTO) throws GenericValidationException {
        if (roleService.getRoleByName(roleDTO.getName()) != null) {
            throw new GenericValidationException("Role with this name already exists");
        }
    }
}

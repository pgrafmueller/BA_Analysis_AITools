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
        if(!userService.existsById(userDTO.getId())) {
            throw new GenericValidationException("User with id " + userDTO.getId() + " does not exist");
        }
        if(!orderService.existsById(orderDTO.getId())) {
            throw new GenericValidationException("Order with id " + orderDTO.getId() + " does not exist");
        }
    }
    @Override
    public void validateUserRoleCollaboration(UserDTO userDTO, RoleDTO roleDTO) throws GenericValidationException {
        if(!userService.existsById(userDTO.getId())) {
            throw new GenericValidationException("User with id " + userDTO.getId() + " does not exist");
        }
        if(!roleService.existsById(roleDTO.getId())) {
            throw new GenericValidationException("Role with id " + roleDTO.getId() + " does not exist");
        }
    }
    @Override
    public void validateOrderUserExistence(OrderDTO orderDTO) throws GenericValidationException {
        if(!orderService.existsById(orderDTO.getId())) {
            throw new GenericValidationException("Order with id " + orderDTO.getId() + " does not exist");
        }
    }
    @Override
    public void validateRoleUserExistence(RoleDTO roleDTO) throws GenericValidationException {
        if(!roleService.existsById(roleDTO.getId())) {
            throw new GenericValidationException("Role with id " + roleDTO.getId() + " does not exist");
        }
    }
    @Override
    public void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException {
        if(userService.existsByEmail(userDTO.getEmail())) {
            throw new GenericValidationException("User with email " + userDTO.getEmail() + " already exists");
        }
    }
    @Override
    public void validateUserUniquePhoneNumber(UserDTO userDTO) throws GenericValidationException {

        if(userService.existsByPhoneNumber(userDTO.getPhoneNumber())) {
            throw new GenericValidationException("User with phone number " + userDTO.getPhoneNumber() + " already exists");
        }
    }
    @Override
    public void validateRoleUniqueName(RoleDTO roleDTO) throws GenericValidationException {

        if(roleService.existsByName(roleDTO.getName())) {
            throw new GenericValidationException("Role with name " + roleDTO.getName() + " already exists");
        }
    }
}

package de.thbingen.project.service.impl;

import de.thbingen.project.errorhandler.exception.GenericValidationException;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ValidationServiceImpl implements ValidationService {

    //validate if the user and the order are not null and if the user is the owner of the order
    @Override
    public void validateUserOrderCollaboration(UserDTO userDTO, OrderDTO orderDTO) throws GenericValidationException {
        if (userDTO == null || orderDTO == null) {
            throw new GenericValidationException("User and order must not be null");
        }
        if (!userDTO.getId().equals(orderDTO.getUser().getId())) {
            throw new GenericValidationException("User and order must be the same");
        }
    }

    //validate if the user and the role are not null and if the user is the owner of the role
    @Override
    public void validateUserRoleCollaboration(UserDTO userDTO, RoleDTO roleDTO) throws GenericValidationException {

        if (userDTO == null || roleDTO == null) {
            throw new GenericValidationException("User and role must not be null");
        }
        if (!userDTO.getId().equals(roleDTO.getUser().getId())) {
            throw new GenericValidationException("User and role must be the same");
        }
    }

    //validate if the order is not null and if the user of the order exists
    @Override
    public void validateOrderUserExistence(OrderDTO orderDTO) throws GenericValidationException {

        if (orderDTO == null) {
            throw new GenericValidationException("Order must not be null");
        }
        if (orderDTO.getUser() == null) {
            throw new GenericValidationException("User must not be null");
        }
    }

    //validate if the role is not null and if the user of the role exists
    @Override
    public void validateRoleUserExistence(RoleDTO roleDTO) throws GenericValidationException {


        if (roleDTO == null) {
            throw new GenericValidationException("Role must not be null");
        }
        if (roleDTO.getUser() == null) {
            throw new GenericValidationException("User must not be null");
        }
    }

    //validate if the user is not null and if the email of the user is unique
    @Override
    public void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException {

        if (userDTO == null) {
            throw new GenericValidationException("User must not be null");
        }
        if (userDTO.getEmail() == null) {
            throw new GenericValidationException("Email must not be null");
        }
    }

    //validate if the user is not null and if the phone number of the user is unique
    @Override
    public void validateUserUniquePhoneNumber(UserDTO userDTO) throws GenericValidationException {


        if (userDTO == null) {
            throw new GenericValidationException("User must not be null");
        }
        if (userDTO.getPhoneNumber() == null) {
            throw new GenericValidationException("Phone number must not be null");
        }
    }

    //validate if the role is not null and if the name of the role is unique
    @Override
    public void validateRoleUniqueName(RoleDTO roleDTO) throws GenericValidationException {
          if (roleDTO == null) {
            throw new GenericValidationException("Role must not be null");
        }
        if (roleDTO.getName() == null) {
            throw new GenericValidationException("Name must not be null");
        }
    }
}

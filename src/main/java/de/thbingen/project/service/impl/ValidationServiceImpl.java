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
    public void validateUserOrderCollaboration(UserDTO userDTO, OrderDTO orderDTO) throws GenericValidationException;

    //validate if the user and the role are not null and if the user is the owner of the role
    @Override
    public void validateUserRoleCollaboration(UserDTO userDTO, RoleDTO roleDTO) throws GenericValidationException ;

    //validate if the order is not null and if the user of the order exists
    @Override
    public void validateOrderUserExistence(OrderDTO orderDTO) throws GenericValidationException ;

    //validate if the role is not null and if the user of the role exists
    @Override
    public void validateRoleUserExistence(RoleDTO roleDTO) throws GenericValidationException ;

    //validate if the user is not null and if the email of the user is unique
    @Override
    public void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException ;

    //validate if the user is not null and if the phone number of the user is unique
    @Override
    public void validateUserUniquePhoneNumber(UserDTO userDTO) throws GenericValidationException ;

    //validate if the role is not null and if the name of the role is unique
    @Override
    public void validateRoleUniqueName(RoleDTO roleDTO) throws GenericValidationException
}

package de.thbingen.project.service;

import de.thbingen.project.errorhandler.exception.GenericValidationException;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

public interface ValidationService {
    void validateUserOrderCollaboration(UserDTO userDTO, OrderDTO orderDTO) throws GenericValidationException;

    void validateUserRoleCollaboration(UserDTO userDTO, RoleDTO roleDTO) throws GenericValidationException;

    void validateOrderUserExistence(OrderDTO orderDTO) throws GenericValidationException;

    void validateRoleUserExistence(RoleDTO roleDTO) throws GenericValidationException;

    void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException;

    void validateUserUniquePhoneNumber(UserDTO userDTO) throws GenericValidationException;

    void validateRoleUniqueName(RoleDTO roleDTO) throws GenericValidationException;
}

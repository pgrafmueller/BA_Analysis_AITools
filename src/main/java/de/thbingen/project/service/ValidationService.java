package de.thbingen.project.service;

import de.thbingen.project.errorhandler.exception.GenericValidationException;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

public interface ValidationService {
    void validateUserOrderCollaboration(UserDTO userDTO, OrderDTO orderDTO) throws GenericValidationException;

    void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException ;
}

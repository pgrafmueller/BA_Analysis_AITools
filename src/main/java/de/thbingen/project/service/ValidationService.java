package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

public interface ValidationService {
    void validateUserOrderCollaboration(UserDTO userDTO, OrderDTO orderDTO);

    void validateUserRoleCollaboration(UserDTO userDTO, RoleDTO roleDTO);

    void validateOrderUserExistence(OrderDTO orderDTO);

    void validateRoleUserExistence(RoleDTO roleDTO);

    void validateUserUniqueEmail(UserDTO userDTO);

    void validateUserUniquePhoneNumber(UserDTO userDTO);

    void validateRoleUniqueName(RoleDTO roleDTO);
}

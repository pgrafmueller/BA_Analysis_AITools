package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.UserEntity;

public interface CalculationService {

    int calculateTotalNumberOfOrdersForUser(UserDTO userDTO);

    int calculateNumberOfUsers();

    int calculateNumberOfOrders();

    int calculateNumberOfOrdersForUser(UserDTO userDTO);

}

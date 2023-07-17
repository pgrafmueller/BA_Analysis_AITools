package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.UserEntity;

public interface CalculationService {
    double calculateTotalOrderAmount(OrderDTO orderDTO);

    double calculateAverageOrderAmountForUser(UserDTO userDTO);

    int calculateTotalNumberOfOrdersForUser(UserDTO userDTO);

    double calculateAverageOrderAmount();

    double calculateAverageOrderAmountForRole(RoleDTO roleDTO);

    int calculateNumberOfUsers();

    int calculateNumberOfOrders();

    int calculateNumberOfOrdersForUser(UserDTO userDTO);

    double calculateAverageOrderAmountForGender(UserEntity.Gender gender);
}

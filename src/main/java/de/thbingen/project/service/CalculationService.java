package de.thbingen.project.service;

import de.thbingen.project.model.dto.UserDTO;

public interface CalculationService {

    int calculateTotalNumberOfOrdersForUser(UserDTO userDTO);


    int calculateNumberOfUsers();

    int calculateNumberOfOrders();

    int calculateNumberOfOrdersForUser(UserDTO userDTO);
}

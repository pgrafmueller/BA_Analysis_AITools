package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

import java.util.List;

public interface SortingService {
    List<UserDTO> sortUsersByName(List<UserDTO> users);

    List<UserDTO> sortUsersByEmail(List<UserDTO> users);

    List<UserDTO> sortUsersByDateOfBirth(List<UserDTO> users);

    List<UserDTO> sortUsersByRoleName(List<UserDTO> users);

    List<UserDTO> sortUsersByStreetName(List<UserDTO> users);

    List<UserDTO> sortUsersByCity(List<UserDTO> users);

    List<UserDTO> sortUsersByState(List<UserDTO> users);

    List<UserDTO> sortUsersByCountry(List<UserDTO> users);

    List<UserDTO> sortUsersByZipCode(List<UserDTO> users);

    List<RoleDTO> sortRolesByName(List<RoleDTO> roles);

    List<OrderDTO> sortOrdersByDate(List<OrderDTO> orders);

    List<OrderDTO> sortOrdersByTotalAmount(List<OrderDTO> orders);
}

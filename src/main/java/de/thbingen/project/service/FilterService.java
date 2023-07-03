package de.thbingen.project.service;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface FilterService {
    List<UserDTO> filterUsersByFirstName(String firstName);
    List<UserDTO> filterUsersByCity(String city);
    List<UserDTO> filterUsersByGender(UserEntity.Gender gender);
    List<UserDTO> filterUsersByEmail(String email);
    List<UserDTO> filterUsersByPhoneNumber(String phoneNumber);
    List<UserDTO> filterUsersByRole(RoleDTO roleDTO);
    List<RoleDTO> filterRolesByName(String name);
    List<RoleDTO> filterRolesByUserCount(int minUserCount);
    List<OrderDTO> filterOrdersByAmountRange(double minAmount, double maxAmount);
    List<OrderDTO> filterOrdersByUser(UserDTO userDTO);
}

package de.thbingen.project.controller;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

public interface UserController {
    UserDTO createUser(@Valid UserDTO userDto);

    List<UserDTO> getAllUsers();

    UserDTO getUserById(Long id);

    UserDTO updateUser(Long id, @Valid UserDTO userDto);

    UserDTO updateUserAddress(Long id, @Valid Address address);

    void deleteUser(Long id);

    UserDTO getUserByEmail(String email);

    List<UserDTO> getUsersByRoleName(String roleName);

    List<UserDTO> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate);

}

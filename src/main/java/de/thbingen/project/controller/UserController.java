package de.thbingen.project.controller;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface UserController {
    UserDTO createUser(@Valid UserDTO userDto);

    UserDTO getUserById(Long id);

    UserDTO updateUser(Long id, @Valid UserDTO userDto);

    void deleteUser(Long id);

    UserDTO getUserByEmail(String email);

}

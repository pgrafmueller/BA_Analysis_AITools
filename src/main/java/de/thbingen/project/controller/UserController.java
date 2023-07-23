package de.thbingen.project.controller;

import de.thbingen.project.model.dto.UserDTO;

import javax.validation.Valid;

public interface UserController {
    UserDTO createUser(@Valid UserDTO userDto);

    UserDTO getUserById(Long id);

    UserDTO updateUser(Long id, @Valid UserDTO userDto);


    void deleteUser(Long id);

    UserDTO getUserByEmail(String email);

}

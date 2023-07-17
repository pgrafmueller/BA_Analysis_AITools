package de.thbingen.project.service;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.UserEntity;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    UserEntity saveUser(UserDTO userDTO);

    List<UserEntity> findAllUsers();

    UserEntity findUserById(Long id);

    UserEntity updateUser(UserDTO userDTO);

    void deleteUser(Long id);

    UserDTO getUserByEmail(String email);

    List<UserDTO> getUsersByRoleName(String roleName);

    List<UserDTO> getUsersByDateOfBirthBetween(LocalDate startDate, LocalDate endDate);

}

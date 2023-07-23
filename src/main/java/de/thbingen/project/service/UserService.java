package de.thbingen.project.service;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface UserService {
    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);


    void deleteUser(Long id);

    UserEntity getUserByEmail(String email);

    List<UserEntity> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate);

}

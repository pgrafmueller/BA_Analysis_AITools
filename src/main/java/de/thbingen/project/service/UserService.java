package de.thbingen.project.service;

import de.thbingen.project.model.entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);

    void deleteUser(Long id);

    UserEntity getUserByEmail(String email);


}

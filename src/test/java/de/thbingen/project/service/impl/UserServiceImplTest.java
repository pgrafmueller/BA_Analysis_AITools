package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository repository;

    @Mock
    private UserDTOToUserEntityMapper mapper;

    @InjectMocks
    private UserServiceImpl service;

    //create a UserEntity and a corresponding UserDTO
    //when the mapper is called, return the entity
    //assert that the save function of the repository is called
    //assert the entity to be the same
    @Test
    void saveUser() {
    }

    //create some UserEntity and save them in the repository
    //when the repository is called, return the entities
    //assert them to be the same list of elements
    @Test
    void getAllUsers() {
    }

    //create a UserEntity and save it in the repository
    //when the repository is called with its id, return the entity
    @Test
    void getUserById() {
    }

    //create a UserEntity and a corresponding UserDTO
    //when the mapper is called, return the entity
    //assert that the save function of the repository is called
    //assert the entity to be the same
    @Test
    void updateUser() {
    }
    
    //create a UserEntity and save it to the repository
    //assert that the repository does not throw an exception
    @Test
    void deleteUser() {
    }

    //create a UserEntity and save it to the repository
    //assert that the repository returns the user when entering its email
    @Test
    void getUserByEmail() {
    }

    //create a RoleEntity and save it to the repository
    //create a UserEntity with the role and save it to the repository
    //assert that the repository returns the user when using the role
    @Test
    void getUsersByRole() {
    }

    //create some UserEntity with different dateOfBirth and save them to the repository
    //assert that the repository returns only the users with dateOfBirth within the chosen LocalDateTime
    @Test
    void getUsersByDateOfBirthBetween() {
    }
}
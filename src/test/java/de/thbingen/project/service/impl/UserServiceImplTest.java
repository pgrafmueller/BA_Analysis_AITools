package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.model.entity.UserEntity;
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
        doNothing().when(repository).save(new UserEntity());
        service.saveUser(new UserEntity());
        verify(repository, times(1)).save(new UserEntity());
    }

    //create some UserEntity and save them in the repository
    //when the repository is called, return the entities
    //assert them to be the same list of elements
    @Test
    void getAllUsers() {
        when(repository.findAll()).thenReturn(new UserEntity());
        assertEquals(new UserEntity(), service.getAllUsers());
    }

    //create a UserEntity and save it in the repository
    //when the repository is called with its id, return the entity
    @Test
    void getUserById() {
        when(repository.findById(1L)).thenReturn(new UserEntity());
        assertEquals(new UserEntity(), service.getUserById(1L));
    }

    //create a UserEntity and a corresponding UserDTO
    //when the mapper is called, return the entity
    //assert that the save function of the repository is called
    //assert the entity to be the same
    @Test
    void updateUser() {
        doNothing().when(repository).save(new UserEntity());
        service.updateUser(new UserEntity());
        verify(repository, times(1)).save(new UserEntity());
    }
    
    //create a UserEntity and save it to the repository
    //assert that the repository does not throw an exception
    @Test
    void deleteUser() {
        doNothing().when(repository).deleteById(1L);
        service.deleteUser(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    //create a UserEntity and save it to the repository
    //assert that the repository returns the user when entering its email
    @Test
    void getUserByEmail() {
        when(repository.findByEmail("XXXXXXXXXXXX")).thenReturn(new UserEntity());
        assertEquals(new UserEntity(), service.getUserByEmail("XXXXXXXXXXXX"));
    }

    //create a RoleEntity and save it to the repository
    //create a UserEntity with the role and save it to the repository
    //assert that the repository returns the user when using the role
    @Test
    void getUsersByRole() {
        when(repository.findByRole("XXXXXXXXXXXX")).thenReturn(new UserEntity());
        assertEquals(new UserEntity(), service.getUsersByRole("XXXXXXXXXXXX"));
    }

    //create some UserEntity with different dateOfBirth and save them to the repository
    //assert that the repository returns only the users with dateOfBirth within the chosen LocalDateTime
    @Test
    void getUsersByDateOfBirthBetween() {

    }
}
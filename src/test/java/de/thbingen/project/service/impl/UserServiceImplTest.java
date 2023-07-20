package de.thbingen.project.service.impl;

import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserServiceImpl service;

    @Test
    void saveUser() {
        service.saveUser(null);
        verify(repository, times(1)).save(null);
    }

    @Test
    void getAllUsers() {
        service.getAllUsers();
        verify(repository, times(1)).findAll();
    }

    @Test
    void getUserById() {
        service.getUserById(1L);
        verify(repository, times(1)).findById(1L);
    }

    @Test
    void updateUser() {
        service.updateUser(null);
        verify(repository, times(1)).save(null);
    }

    @Test
    void deleteUser() {
        service.deleteUser(null);
        verify(repository, times(1)).delete(null);
    }

    @Test
    void getUserByEmail() {
        service.getUserByEmail("XXXXXXXXXXXXX");
        verify(repository, times(1)).findByEmail("XXXXXXXXXXXXX");
    }

}
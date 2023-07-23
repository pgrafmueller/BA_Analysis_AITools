package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository repository;

    @Mock
    private UserDTOToUserEntityMapper mapper;

    @InjectMocks
    private UserServiceImpl service;


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


}
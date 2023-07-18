package de.thbingen.project.service.impl;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RoleServiceImplTest {

    @Mock
    private RoleRepository repository;

    @InjectMocks
    private RoleServiceImpl service;

    @Test
    void testSaveRole() {
        RoleDTO role = new RoleDTO();
        role.setName("Test");
        service.saveRole(role);
        verify(repository, times(1)).save(any());
    }

    @Test
    void getAllRoles() {
        service.getAllRoles();
        verify(repository, times(1)).findAll();
    }

    @Test
    void getRoleById() {
        service.getRoleById(1L);
        verify(repository, times(1)).findById(any());
    }

    @Test
    void updateRole() {
        RoleDTO role = new RoleDTO();
        role.setName("Test");
        service.updateRole(role);
        verify(repository, times(1)).save(any());
    }

    @Test
    void deleteRole() {
        service.deleteRole(1L);
        verify(repository, times(1)).deleteById(any());
    }

    @Test
    void getRolesContainingUser() {
        service.getRolesContainingUser(1L);
        verify(repository, times(1)).findRolesContainingUser(any());
    }
}
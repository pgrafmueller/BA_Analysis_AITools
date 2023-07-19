package de.thbingen.project.service.impl;

import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class RoleServiceImplTest {

    @Mock
    private RoleRepository repository;

    @InjectMocks
    private RoleServiceImpl service;

    @Test
    void saveRole() {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(1L);
        roleEntity.setName("test");
        when(repository.save(any())).thenReturn(roleEntity);
        RoleEntity savedRole = service.saveRole(roleEntity);
        assertThat(savedRole).isNotNull();
        assertThat(savedRole.getId()).isNotNull();
        assertThat(savedRole.getName()).isEqualTo(roleEntity.getName());
    }

    @Test
    void getAllRoles() {
        fail("not implemented");
    }

    @Test
    void getRoleById() {
        fail("not implemented");
    }

    @Test
    void updateRole() {
        fail("not implemented");
    }

    @Test
    void deleteRole() {
        fail("not implemented");
    }

    @Test
    void getRolesContainingUser() {
        fail("not implemented");
    }
}
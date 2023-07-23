package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.RoleDTOtoRoleEntityMapper;
import de.thbingen.project.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RoleServiceImplTest {

    @Mock
    private RoleRepository repository;
    
    @Mock
    private RoleDTOtoRoleEntityMapper mapper;

    @InjectMocks
    private RoleServiceImpl service;


    //create a RoleEntity and a corresponding RoleDTO
    //when the mapper is called, return the entity
    //assert that the save function of the repository is called
    //assert the entity to be the same
    @Test
    void saveRole() {
    }

    //create some RoleEntity and save them in the repository
    //when the repository is called, return the entities
    //assert them to be the same list of elements
    @Test
    void getAllRoles() {
    }

    //create a RoleEntity and save it in the repository
    //when the repository is called with its id, return the entity
    @Test
    void getRoleById() {
    }

    //create a RoleEntity and save it to the repository
    //create a corresponding RoleDTO with a different itemName
    //when the mapper is called, return the converted entity
    //assert that the save function of the repository is called and return the updated entity
    @Test
    void updateRole() {
    }

    //create a RoleEntity and save it to the repository
    //assert that the repository does not throw an exception
    @Test
    void deleteRole() {
    }

    //create some RoleEntity and save them to the repository
    //create a UserEntity with the roles added as a set
    //save the UserEntity
    //assert that getRolesContainingUser returns the set of roles
    @Test
    void getRolesContainingUser() {
    }
}
package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class RoleEntityToRoleDTOMapperImplTest {

    private final RoleEntityToRoleDTOMapperImpl roleEntityToRoleDTOMapper = new RoleEntityToRoleDTOMapperImpl();

    //create some UserEntity with example values
    //assert that the roleEntityToRoleDTOMapper converts the Entity with mapUserEntitiesToUserIds
    @Test
    void mapUserEntitiesToUserIds() {
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(null)).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object())).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object[]{null, null})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object[]{new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object[]{new Object(), new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object[]{new Object(), new Object(), new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object[]{new Object(), new Object(), new Object(), new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(new Object[]{new Object(), new Object(), new Object(), new Object(), new Object(), new Object()})).isNull();
    }
    
    //create a RoleEntity with example values
    //create a RoleDTO with expected values
    //assert that the roleEntityToRoleDTOMapper converts the Entity with mapRoleEntityToRoleDTO
    @Test
    void mapRoleEntityToRoleDTO() {
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(null)).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object())).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object[]{null, null})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object[]{new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object[]{new Object(), new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object[]{new Object(), new Object(), new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object[]{new Object(), new Object(), new Object(), new Object(), new Object()})).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new Object[]{new Object(), new Object(), new Object(), new Object(), new Object(), new Object()})).isNull();
    }
}
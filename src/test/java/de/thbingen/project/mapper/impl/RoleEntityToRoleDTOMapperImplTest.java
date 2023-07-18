package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class RoleEntityToRoleDTOMapperImplTest {

    private final RoleEntityToRoleDTOMapperImpl roleEntityToRoleDTOMapper = new RoleEntityToRoleDTOMapperImpl();

    @Test
    void mapUserEntitiesToUserIds() {
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(null)).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isNotNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isInstanceOf(de.thbingen.project.model.dto.RoleDTO.class);
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isEqualTo(new de.thbingen.project.model.dto.RoleDTO());
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isNotEqualTo(new de.thbingen.project.model.dto.RoleDTO());
    }

    @Test
    void mapRoleEntityToRoleDTO() {
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(null)).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isNotNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isInstanceOf(de.thbingen.project.model.dto.RoleDTO.class);
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isEqualTo(new de.thbingen.project.model.dto.RoleDTO());
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new de.thbingen.project.model.RoleEntity())).isNotEqualTo(new de.thbingen.project.model.dto.RoleDTO());
    }
}
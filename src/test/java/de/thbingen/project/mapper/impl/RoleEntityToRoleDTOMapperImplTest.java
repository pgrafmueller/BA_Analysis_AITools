package de.thbingen.project.mapper.impl;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RoleEntityToRoleDTOMapperImplTest {

    private final RoleEntityToRoleDTOMapperImpl roleEntityToRoleDTOMapper = new RoleEntityToRoleDTOMapperImpl();

    @Test
    void mapUserEntitiesToUserIds() {
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(null)).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isNotNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isInstanceOf(RoleDTO.class);
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isEqualTo(new RoleDTO());
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isNotEqualTo(new RoleDTO());
    }

    @Test
    void mapRoleEntityToRoleDTO() {
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(null)).isNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isNotNull();
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isInstanceOf(RoleDTO.class);
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isEqualTo(new RoleDTO());
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(new RoleEntity())).isNotEqualTo(new RoleDTO());
    }
}
package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RoleEntityToRoleDTOMapperImplTest {
    private final RoleEntityToRoleDTOMapperImpl roleEntityToRoleDTOMapper = new RoleEntityToRoleDTOMapperImpl();

    @Test
    void mapUserEntitiesToUserIds() {
        assertThat(roleEntityToRoleDTOMapper.mapUserEntitiesToUserIds(null)).isNull();
    }

    @Test
    void mapRoleEntityToRoleDTO() {
        assertThat(roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(null)).isNull();
    }
}
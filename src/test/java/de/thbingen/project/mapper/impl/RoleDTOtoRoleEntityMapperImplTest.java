package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class RoleDTOtoRoleEntityMapperImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private RoleDTOtoRoleEntityMapperImpl roleDTOtoRoleEntityMapper;
    @Test
    void mapUserIdsToUserEntities() {
        when(userRepository.findById(1L)).thenReturn(null);
        assertThat(roleDTOtoRoleEntityMapper.mapUserIdsToUserEntities(null)).isNull();
    }

    @Test
    void mapRoleDTOtoRoleEntity() {
        when(userRepository.findById(1L)).thenReturn(null);
        assertThat(roleDTOtoRoleEntityMapper.mapRoleDTOtoRoleEntity(null)).isNull();
    }
}
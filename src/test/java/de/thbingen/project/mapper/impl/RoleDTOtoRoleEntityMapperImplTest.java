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
        fail("not implemented");
    }

    @Test
    void mapRoleDTOtoRoleEntity() {
        fail("not implemented");
    }
}
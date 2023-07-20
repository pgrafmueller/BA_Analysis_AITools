package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class RoleDTOtoRoleEntityMapperImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private RoleDTOtoRoleEntityMapperImpl roleDTOtoRoleEntityMapper;

    //create some UserEntity with example values
    //save the userEntity objects in the userRepository
    //test if the orderEntityToOrderDTOMapper converts the ids to Entity with mapUserIdsToUserEntities
    @Test
    void mapUserIdsToUserEntities() {
    }
    
    //create a RoleDTO populated with example values
    //create a RoleEntity with the expected values
    //test if the roleDTOtoRoleEntityMapper converts the DTO to Entity with mapRoleDTOtoRoleEntity
    @Test
    void mapRoleDTOtoRoleEntity() {
    }
}
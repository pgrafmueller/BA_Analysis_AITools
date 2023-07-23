package de.thbingen.project.mapper.impl;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class RoleDTOtoRoleEntityMapperImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private RoleDTOtoRoleEntityMapperImpl roleDTOtoRoleEntityMapper;

    //create a RoleDTO populated with example values
    //create a RoleEntity with the expected values
    //assert that the roleDTOtoRoleEntityMapper converts the DTO to Entity with mapRoleDTOtoRoleEntity
    @Test
    void mapRoleDTOtoRoleEntity() {
        //given
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(1L);
        roleDTO.setName("ADMIN");
        //when
        RoleEntity roleEntity = roleDTOtoRoleEntityMapper.mapRoleDTOtoRoleEntity(roleDTO);
        //then
        assertThat(roleEntity.getId()).isEqualTo(1L);
        assertThat(roleEntity.getName()).isEqualTo("ADMIN");
    }
}
package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
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
class UserDTOToUserEntityMapperImplTest {
    @Mock
    private RoleRepository roleRepository;
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private UserDTOToUserEntityMapperImpl userDTOToUserEntityMapper;
    @Test
    void mapNameToFirstName() {
        assertThat(userDTOToUserEntityMapper.mapNameToFirstName(null)).isNull();
    }

    @Test
    void mapNameToLastName() {
        assertThat(userDTOToUserEntityMapper.mapNameToLastName(null)).isNull();
    }

    @Test
    void encodePassword() {
        assertThat(userDTOToUserEntityMapper.encodePassword(null)).isNull();
    }

    @Test
    void mapPhoneNumbersListToPhoneNumbers() {
        assertThat(userDTOToUserEntityMapper.mapPhoneNumbersListToPhoneNumbers(null)).isNull();
    }

    @Test
    void mapRoleIdsToRoleEntities() {
        when(roleRepository.findById(1L)).thenReturn(null);
        assertThat(userDTOToUserEntityMapper.mapRoleIdsToRoleEntities(null)).isNull();
    }

    @Test
    void mapOrderIdsToOrderEntities() {
        when(orderRepository.findById(1L)).thenReturn(null);
        assertThat(userDTOToUserEntityMapper.mapOrderIdsToOrderEntities(null)).isNull();
    }

    @Test
    void mapDateOfBirthStringToLocalDateTime() {
        assertThat(userDTOToUserEntityMapper.mapDateOfBirthStringToLocalDateTime(null)).isNull();
    }


    @Test
    void mapUserDTOtoUserEntity() {
        when(roleRepository.findById(1L)).thenReturn(null);
        when(orderRepository.findById(1L)).thenReturn(null);
        assertThat(userDTOToUserEntityMapper.mapUserDTOtoUserEntity(null)).isNull();
    }
}
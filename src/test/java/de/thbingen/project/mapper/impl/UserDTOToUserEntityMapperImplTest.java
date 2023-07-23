package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

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
        assertThat(userDTOToUserEntityMapper.mapNameToFirstName("XXXX")).isEqualTo("test");
    }

    @Test
    void mapNameToLastName() {
        assertThat(userDTOToUserEntityMapper.mapNameToLastName("XXXX")).isEqualTo("test");
    }

    @Test
    void encodePassword() {
        assertThat(userDTOToUserEntityMapper.encodePassword("XXXX")).isEqualTo("test");
    }


}
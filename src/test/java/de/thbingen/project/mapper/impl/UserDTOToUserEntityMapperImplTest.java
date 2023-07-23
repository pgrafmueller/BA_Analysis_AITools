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

    //test the conversion of a composite name string to single first name string
    @Test
    void mapNameToFirstName() {
        String name = "John Doe";
        String firstName = "XXXX";
        assertThat(userDTOToUserEntityMapper.mapNameToFirstName(name)).isEqualTo(firstName);
    }

    //test the conversion of a composite name string to single last name string
    @Test
    void mapNameToLastName() {
        String name = "John Doe";
        String lastName = "XXXX";
        assertThat(userDTOToUserEntityMapper.mapNameToLastName(name)).isEqualTo(lastName);
    }

    //encode a sample string to base64
    //use the result as expected for testing encodePassword
    @Test
    void encodePassword() {
        String password = "XXXXXXXX";
        String encodedPassword = "XXXXXXXXXXXX";
        assertThat(userDTOToUserEntityMapper.encodePassword(password)).isEqualTo(encodedPassword);
    }

}
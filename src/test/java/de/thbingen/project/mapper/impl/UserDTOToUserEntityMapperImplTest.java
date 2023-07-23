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

    //create a string of arbitrary phone numbers concatenated with ','
    //assert all the strings in a list as the result
    @Test
    void mapPhoneNumbersListToPhoneNumbers() {

    }

    //create some RoleEntities and save them to roleRepository
    //use the ids of the RoleEntities as input and assert them as a result
    @Test
    void mapRoleIdsToRoleEntities() {

    }

    //create some OrderEntities and save them to orderRepository
    //use the ids of the OrderEntities as input and assert them as a result
    @Test
    void mapOrderIdsToOrderEntities() {

    }

    //create a string representing a date and time
    //assert a LocalDateTime corresponding to this string as the result
    @Test
    void mapDateOfBirthStringToLocalDateTime() {

    }

    //create an Address
    //assert the address is returned
    @Test
    void mapAddressDTOtoAddressEmbeddable() {

    }

    //create a UserEntity populated with example values
    //create a RoleEntity with the expected values
    //assert that the roleDTOtoRoleEntityMapper converts the DTO to Entity with mapRoleDTOtoRoleEntity
    @Test
    void mapUserDTOtoUserEntity() {

    }
}
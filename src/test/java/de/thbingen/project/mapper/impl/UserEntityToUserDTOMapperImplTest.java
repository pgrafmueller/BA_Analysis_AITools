package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserEntityToUserDTOMapperImplTest {

    private final UserEntityToUserDTOMapperImpl userEntityToUserDTOMapper = new UserEntityToUserDTOMapperImpl();

    //create two strings
    //assert the concatenated strings as a result, seperated with a space
    @Test
    void mapFirstAndLastNameToFullName() {
    }

    //create a random string
    //base64 encode the string as a new variable
    //assert that the string is the result when inputting the encoded string
    @Test
    void decodeBase64EncodedPassword() {
    }

    //create a list of strings representing phone numbers
    //assert the result to be a concatenated string with all the numbers
    @Test
    void mapPhoneNumbersListToPhoneNumbersString() {
    }

    //create a RoleEntity and expect its id as a result
    @Test
    void mapRoleEntitiesToRoleIds() {
    }

    //create a OrderEntity and expect its id as a result
    @Test
    void mapOrderEntitiesToOrderIds() {
    }

    //create a random LocalDateTime
    //assert its string representation as a result
    @Test
    void mapLocalDateTimeToString() {
    }

    //create a UserEntity
    //create a corresponding UserDTO and assert it as a result
    @Test
    void mapUserEntityToUserDTO() {
    }
}
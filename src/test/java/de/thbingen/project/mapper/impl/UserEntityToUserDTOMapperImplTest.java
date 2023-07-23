package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class UserEntityToUserDTOMapperImplTest {

    private final UserEntityToUserDTOMapperImpl userEntityToUserDTOMapper = new UserEntityToUserDTOMapperImpl();

    //create two strings
    //assert the concatenated strings as a result, seperated with a space
    @Test
    void mapFirstAndLastNameToFullName() {
        String firstName = "XXXX";
        String lastName = "XXX";
        String fullName = userEntityToUserDTOMapper.mapFirstAndLastNameToFullName(firstName, lastName);
        assertThat(fullName).isEqualTo(firstName + " " + lastName);
    }

}
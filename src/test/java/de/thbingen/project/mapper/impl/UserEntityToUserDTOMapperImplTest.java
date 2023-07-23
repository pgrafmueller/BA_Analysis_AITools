package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class UserEntityToUserDTOMapperImplTest {
    private final UserEntityToUserDTOMapperImpl userEntityToUserDTOMapper = new UserEntityToUserDTOMapperImpl();

    @Test
    void mapFirstAndLastNameToFullName() {
        assertThat(userEntityToUserDTOMapper.mapFirstAndLastNameToFullName(null, null)).isNull();
    }

    @Test
    void decodeBase64EncodedPassword() {
        assertThat(userEntityToUserDTOMapper.decodeBase64EncodedPassword(null)).isNull();
    }

    @Test
    void mapPhoneNumbersListToPhoneNumbersString() {
        assertThat(userEntityToUserDTOMapper.mapPhoneNumbersListToPhoneNumbersString(null)).isNull();
    }

    @Test
    void mapRoleEntitiesToRoleIds() {
        assertThat(userEntityToUserDTOMapper.mapRoleEntitiesToRoleIds(null)).isNull();
    }

    @Test
    void mapOrderEntitiesToOrderIds() {
        assertThat(userEntityToUserDTOMapper.mapOrderEntitiesToOrderIds(null)).isNull();
    }

    @Test
    void mapLocalDateTimeToString() {
        assertThat(userEntityToUserDTOMapper.mapLocalDateTimeToString(null)).isNull();
    }

    @Test
    void mapUserEntityToUserDTO() {
        assertThat(userEntityToUserDTOMapper.mapUserEntityToUserDTO(null)).isNull();
    }
}
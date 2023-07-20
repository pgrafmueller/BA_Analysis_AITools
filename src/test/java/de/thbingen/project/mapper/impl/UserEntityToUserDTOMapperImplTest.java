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

    @Test
    void mapFirstAndLastNameToFullName() {
        assertThat(userEntityToUserDTOMapper.mapFirstAndLastNameToFullName("test", "test")).isEqualTo("test test");
    }

}
package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderDTOtoOrderEntityMapperImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private OrderDTOtoOrderEntityMapperImpl orderDTOtoOrderEntityMapper;

    @Test
    void mapUserIdToUserEntity() {
        when(userRepository.findById(1L)).thenReturn(null);
        assertThat(orderDTOtoOrderEntityMapper.mapUserIdToUserEntity(1L)).isNull();
    }

    @Test
    void mapOrderDTOtoOrderEntity() {
        when(userRepository.findById(1L)).thenReturn(null);
        assertThat(orderDTOtoOrderEntityMapper.mapOrderDTOtoOrderEntity(null)).isNull();
    }
}
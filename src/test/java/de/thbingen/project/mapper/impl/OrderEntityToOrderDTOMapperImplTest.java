package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class OrderEntityToOrderDTOMapperImplTest {

    private final OrderEntityToOrderDTOMapperImpl orderEntityToOrderDTOMapper = new OrderEntityToOrderDTOMapperImpl();

    @Test
    void mapUserEntityToUserId() {
        assertThat(orderEntityToOrderDTOMapper.mapUserEntityToUserId(null)).isNull();
    }

    @Test
    void mapOrderEntityToOrderDTO() {
        assertThat(orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(null)).isNull();
    }
}
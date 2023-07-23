package de.thbingen.project.mapper.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class OrderEntityToOrderDTOMapperImplTest {

    private final OrderEntityToOrderDTOMapperImpl orderEntityToOrderDTOMapper = new OrderEntityToOrderDTOMapperImpl();


    //create a UserEntity with example values
    //assert that the orderEntityToOrderDTOMapper converts the Entity with mapUserEntityToUserId
    @Test
    void mapUserEntityToUserId() {
        assertThat(orderEntityToOrderDTOMapper.mapUserEntityToUserId(null)).isNull();
    }

    //create a OrderEntity with example values
    //create a OrderDTO with expected values
    //assert that the orderEntityToOrderDTOMapper converts the Entity with mapOrderEntityToOrderDTO
    @Test
    void mapOrderEntityToOrderDTO() {
        assertThat(orderEntityToOrderDTOMapper.mapOrderEntityToOrderDTO(null)).isNull();
    }
}
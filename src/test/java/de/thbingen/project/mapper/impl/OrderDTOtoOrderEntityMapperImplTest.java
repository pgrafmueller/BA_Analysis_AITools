package de.thbingen.project.mapper.impl;

import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderDTOtoOrderEntityMapperImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private OrderDTOtoOrderEntityMapperImpl orderDTOtoOrderEntityMapper;

    //create a OrderDTO populated with example values
    //create a OrderEntity with the expected values
    //assert that the orderDTOtoOrderEntityMapper converts the DTO to Entity with mapOrderDTOtoOrderEntity
    @Test
    void mapOrderDTOtoOrderEntity() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId(1L);
        orderDTO.setUserId(1L);
        orderDTO.setTotalPrice(100.0);
        orderDTO.setOrderStatus("PENDING");

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderId(1L);
        orderEntity.setUserId(1L);
        orderEntity.setTotalPrice(100.0);
        orderEntity.setOrderStatus("PENDING");

        when(userRepository.findById(1L)).thenReturn(java.util.Optional.of(new UserEntity()));

        assertThat(orderDTOtoOrderEntityMapper.mapOrderDTOtoOrderEntity(orderDTO)).isEqualTo(orderEntity);
    }
}
package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

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
    }
}
package de.thbingen.project.mapper.impl;

import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserDTOToUserEntityMapperImplTest {
    @Mock
    private RoleRepository roleRepository;
    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private UserDTOToUserEntityMapperImpl userDTOToUserEntityMapper;


}
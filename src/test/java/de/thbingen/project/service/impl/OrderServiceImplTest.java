package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    @Mock
    private OrderRepository repository;

    @Mock
    private OrderDTOtoOrderEntityMapper mapper;

    @InjectMocks
    private OrderServiceImpl service;


    //create some OrderEntity and save them in the repository
    //when the repository is called, return the entities
    //assert them to be the same list of elements
    @Test
    void getAllOrders() {
        service.getAllOrders();
        verify(repository, times(1)).findAll();
    }

    //create a OrderEntity and save it in the repository
    //when the repository is called with its id, return the entity
    @Test
    void getOrderById() {
        service.getOrderById(1L);
        verify(repository, times(1)).findById(1L);
    }



    //create a OrderEntity and save it to the repository
    //assert that the repository does not throw an exception
    @Test
    void deleteOrder() {
        service.deleteOrder(1L);
        verify(repository, times(1)).deleteById(1L);
    }

}
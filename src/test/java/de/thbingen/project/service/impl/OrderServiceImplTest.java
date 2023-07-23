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

    //create a OrderEntity and a corresponding OrderDTO
    //when the mapper is called, return the entity
    //assert that the save function of the repository is called
    //assert the entity to be the same
    @Test
    void saveOrder() {
        service.saveOrder(null);
        verify(repository, times(1)).save(null);
        verify(mapper, times(1)).orderDTOtoOrderEntity(null);
    }

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
    //create a corresponding OrderDTO with a different itemName
    //when the mapper is called, return the converted entity
    //assert that the save function of the repository is called and return the updated entity
    @Test
    void updateOrder() {
        service.updateOrder(1L, null);
        verify(repository, times(1)).save(null);
        verify(repository, times(1)).findById(1L);
        verify(mapper, times(1)).orderEntityToOrderDTO(null);
    }

    //create a OrderEntity and save it to the repository
    //assert that the repository does not throw an exception
    @Test
    void deleteOrder() {
        service.deleteOrder(1L);
        verify(repository, times(1)).deleteById(1L);
    }

    //create a OrderEntity and save it to the repository
    //create a UserEntity with the OrderEntity added as a list of orders
    //save the UserEntity
    //assert that getOrdersByUser returns the OrderEntity
    @Test
    void getOrdersByUser() {
        service.getOrdersByUser(1L);
        verify(repository, times(1)).getOrdersByUser(1L);
    }
}
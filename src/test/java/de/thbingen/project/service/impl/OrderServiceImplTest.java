package de.thbingen.project.service.impl;

import de.thbingen.project.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    @Mock
    private OrderRepository repository;

    @InjectMocks
    private OrderServiceImpl service;
    @Test
    void saveOrder() {
        service.saveOrder(null);
        verify(repository, times(1)).save(null);
    }

    @Test
    void getAllOrders() {
        service.getAllOrders();
        verify(repository, times(1)).findAll();
    }

    @Test
    void getOrderById() {
        service.getOrderById(1L);
        verify(repository, times(1)).findById(1L);
    }

    @Test
    void updateOrder() {
        service.updateOrder(null);
        verify(repository, times(1)).save(null);
    }

    @Test
    void deleteOrder() {
        service.deleteOrder(null);
        verify(repository, times(1)).delete(null);
    }

    @Test
    void getOrdersByUser() {
        service.getOrdersByUser(null);
        verify(repository, times(1)).findByUser(null);
    }
}
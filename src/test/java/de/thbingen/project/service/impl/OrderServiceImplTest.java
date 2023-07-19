package de.thbingen.project.service.impl;

import de.thbingen.project.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    @Mock
    private OrderRepository repository;

    @InjectMocks
    private OrderServiceImpl service;

    @Test
    void saveOrder() {
        fail("not implemented");
    }

    @Test
    void getAllOrders() {
        fail("not implemented");
    }

    @Test
    void getOrderById() {
        fail("not implemented");
    }

    @Test
    void updateOrder() {
        fail("not implemented");
    }

    @Test
    void deleteOrder() {
        fail("not implemented");
    }

    @Test
    void getOrdersByUser() {
        fail("not implemented");
    }
}
package de.thbingen.project.repository;

import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<OrderRepository, Long> {
    List<OrderEntity> findOrdersByUser(UserEntity user);
}

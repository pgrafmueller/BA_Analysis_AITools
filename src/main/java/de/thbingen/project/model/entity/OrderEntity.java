package de.thbingen.project.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class OrderEntity {
    @Id
    private long id;
    private String itemName;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}

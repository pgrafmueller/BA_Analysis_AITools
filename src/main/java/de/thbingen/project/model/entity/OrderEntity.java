package de.thbingen.project.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    private long id;
    private String itemName;
    private int amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}

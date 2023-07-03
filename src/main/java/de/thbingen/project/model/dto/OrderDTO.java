package de.thbingen.project.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

@Data
@EqualsAndHashCode
public class OrderDTO {
    private long id;

    @NotEmpty(message = "Item name cannot be empty")
    private String itemName;

    @Min(value = 1, message = "Amount must be at least 1")
    private int amount;

    @PositiveOrZero(message = "User ID must be a positive number or zero")
    private long userId;
}

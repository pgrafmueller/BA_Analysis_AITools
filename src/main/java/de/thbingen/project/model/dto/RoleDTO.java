package de.thbingen.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {
    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Size(min = 1, message = "User IDs list must contain at least one ID")
    private Set<Long> userIds;
}

package de.thbingen.project.controller;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

import javax.validation.Valid;
import java.util.List;

public interface RoleController {
    RoleDTO createRole(@Valid RoleDTO roleDto);

    RoleDTO getRoleById(Long id);

    RoleDTO updateRole(Long id, @Valid RoleDTO roleDto);

    void deleteRole(Long id);

}

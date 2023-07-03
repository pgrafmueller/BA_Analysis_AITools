package de.thbingen.project.service;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

import java.util.List;

public interface RoleService {
    RoleDTO createRole(RoleDTO roleDTO);

    List<RoleDTO> getAllRoles();

    RoleDTO getRoleById(Long id);

    RoleDTO updateRole(RoleDTO roleDTO);

    void deleteRole(Long id);

    List<UserDTO> getUsersWithRole(String roleName);
}

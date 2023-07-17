package de.thbingen.project.service;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import javax.management.relation.Role;
import java.util.List;

public interface RoleService {
    RoleDTO createRole(RoleDTO roleDTO);

    List<RoleDTO> getAllRoles();

    RoleDTO getRoleById(Long id);

    RoleDTO updateRole(RoleDTO roleDTO);

    void deleteRole(Long id);

    List<RoleEntity> getRolesContainingUser(UserEntity userEntity);
}

package de.thbingen.project.service;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import javax.management.relation.Role;
import java.util.List;

public interface RoleService {
    RoleEntity createRole(RoleDTO roleDTO);

    List<RoleEntity> getAllRoles();

    RoleEntity getRoleById(Long id);

    RoleEntity updateRole(RoleDTO roleDTO);

    void deleteRole(Long id);

    List<RoleEntity> getRolesContainingUser(UserEntity userEntity);
}

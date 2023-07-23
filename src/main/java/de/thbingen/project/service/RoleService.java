package de.thbingen.project.service;

import de.thbingen.project.model.entity.RoleEntity;

import java.util.List;

public interface RoleService {

    List<RoleEntity> getAllRoles();

    RoleEntity getRoleById(Long id);

    void deleteRole(Long id);

}

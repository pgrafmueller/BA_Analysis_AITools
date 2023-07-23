package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.RoleController;
import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleControllerImpl implements RoleController {
    private final RoleService roleService;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;

    @Override
    public RoleDTO createRole(@Valid RoleDTO roleDto) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleService.saveRole(roleDto));
    }

    @Override
    public RoleDTO getRoleById(Long id) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleService.getRoleById(id));
    }

    @Override
    public RoleDTO updateRole(Long id, @Valid RoleDTO roleDto) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleService.updateRole(roleDto));
    }

    @Override
    public void deleteRole(Long id) {
        roleService.deleteRole(id);
    }
}

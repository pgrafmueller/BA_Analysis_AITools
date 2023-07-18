package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.RoleController;
import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleControllerImpl implements RoleController {
    private final RoleService roleService;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;
    @Override
    public RoleDTO createRole(@Valid RoleDTO roleDto) {
        return roleEntityToRoleDTOMapper.map(roleService.createRole(roleEntityToRoleDTOMapper.map(roleDto)));
    }
    @Override
    public List<RoleDTO> getAllRoles() {
        return roleEntityToRoleDTOMapper.map(roleService.getAllRoles());
    }
    @Override
    public RoleDTO getRoleById(Long id) {
        return roleEntityToRoleDTOMapper.map(roleService.getRoleById(id));
    }
    @Override
    public RoleDTO getRoleByName(String name) {
        return roleEntityToRoleDTOMapper.map(roleService.getRoleByName(name));
    }
    @Override
    public RoleDTO updateRole(Long id, @Valid RoleDTO roleDto) {
        return roleEntityToRoleDTOMapper.map(roleService.updateRole(id, roleEntityToRoleDTOMapper.map(roleDto)));
    }
    @Override
    public void deleteRole(Long id) {
        roleService.deleteRole(id);
    }
}

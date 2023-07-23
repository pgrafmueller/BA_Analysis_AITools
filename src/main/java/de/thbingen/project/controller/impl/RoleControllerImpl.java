package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.RoleController;
import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.service.RoleService;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleControllerImpl implements RoleController {
    private final RoleService roleService;
    private final UserService userService;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;

    //call the roleService to save the role
    @Override
    public RoleDTO createRole(@Valid RoleDTO roleDto) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleService.saveRole(roleDto));
    }



    //call the roleService to get the role by its id
    @Override
    public RoleDTO getRoleById(Long id) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleService.getRoleById(id));
    }

    //call the roleService to update the role
    @Override
    public RoleDTO updateRole(Long id, @Valid RoleDTO roleDto) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleService.updateRole(roleDto));
    }

    //call the roleService to delete the role
    @Override
    public void deleteRole(Long id) {
        roleService.deleteRole(id);
    }


}

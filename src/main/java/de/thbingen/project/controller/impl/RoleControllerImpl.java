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
    public RoleDTO createRole(@Valid RoleDTO roleDto);

    //call the roleService to get all roles
    @Override
    public List<RoleDTO> getAllRoles();

    //call the roleService to get the role by its id
    @Override
    public RoleDTO getRoleById(Long id);

    //call the roleService to get the role by its name
    @Override
    public RoleDTO getRoleByName(String name);

    //call the roleService to update the role
    @Override
    public RoleDTO updateRole(Long id, @Valid RoleDTO roleDto);

    //call the roleService to delete the role
    @Override
    public void deleteRole(Long id);

    //call the userService to get all users with the role
    //if the role does not exist return an empty list
    @Override
    public List<UserDTO> getUsersWithRole(String roleName);
}

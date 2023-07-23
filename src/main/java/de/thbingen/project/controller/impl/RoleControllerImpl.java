package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.RoleController;
import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RoleControllerImpl implements RoleController {
    private final RoleService roleService;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;

    @Override
    public void deleteRole(Long id) {
        roleService.deleteRole(id);
    }
}

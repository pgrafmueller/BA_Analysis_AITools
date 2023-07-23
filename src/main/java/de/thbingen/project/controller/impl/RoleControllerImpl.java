package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.RoleController;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class RoleControllerImpl implements RoleController {
    private final RoleService roleService;

    @Override
    public void deleteRole(Long id) {
        roleService.deleteRole(id);
    }
}

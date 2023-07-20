package de.thbingen.project.controller;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;

import javax.validation.Valid;
import java.util.List;

public interface RoleController {

    void deleteRole(Long id);

}

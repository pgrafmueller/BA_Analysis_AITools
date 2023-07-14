package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.RoleDTOtoRoleEntityMapper;
import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.repository.RoleRepository;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDTOtoRoleEntityMapper roleDTOtoRoleEntityMapper;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;
    private final RoleRepository roleRepository;
}

package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.RoleDTOtoRoleEntityMapper;
import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.RoleRepository;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDTOtoRoleEntityMapper roleDTOtoRoleEntityMapper;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;
    private final RoleRepository roleRepository;

    @Override
    public RoleDTO createRole(RoleDTO roleDTO) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(
                roleRepository.save(roleDTOtoRoleEntityMapper.mapRoleDTOToRoleEntity(roleDTO)));
    }
    @Override
    public List<RoleDTO> getAllRoles() {
        return roleEntityToRoleDTOMapper.mapRoleEntitiesToRoleDTOs(roleRepository.findAll());
    }
    @Override
    public RoleDTO getRoleById(Long id) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(roleRepository.findById(id).get());
    }
    @Override
    public RoleDTO updateRole(RoleDTO roleDTO) {
        return roleEntityToRoleDTOMapper.mapRoleEntityToRoleDTO(
                roleRepository.save(roleDTOtoRoleEntityMapper.mapRoleDTOToRoleEntity(roleDTO)));
    }
    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }
    @Override
    public List<RoleEntity> getRolesContainingUser(UserEntity userEntity) {
        return roleRepository.findByUsersContaining(userEntity);
    }
}

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

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDTOtoRoleEntityMapper roleDTOtoRoleEntityMapper;
    private final RoleEntityToRoleDTOMapper roleEntityToRoleDTOMapper;
    private final RoleRepository roleRepository;

    //map the roleDTO to a roleEntity by using the mapper and save it in the database
    @Override
    public RoleEntity createRole(RoleDTO roleDTO) {
        return roleRepository.save(roleDTOtoRoleEntityMapper.mapRoleDTOtoRoleEntity(roleDTO));
    }

    //get all roles from the database and return them
    @Override
    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    //get the role from the database by its id and return it
    @Override
    public RoleEntity getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    //map the roleDTO to a roleEntity by using the mapper and update it in the database
    @Override
    public RoleEntity updateRole(RoleDTO roleDTO) {
        return roleRepository.save(roleDTOtoRoleEntityMapper.mapRoleDTOtoRoleEntity(roleDTO));
    }

    //delete the role from the database by its id
    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    //get all roles from the database containing the given user and return them
    @Override
    public List<RoleEntity> getRolesContainingUser(UserEntity userEntity) {
        return roleRepository.findAllByUsersContaining(userEntity);
    }

    //get the role from the database by its name and return it
    public RoleEntity getRoleByName(String name) {
        return roleRepository.findByName(name);
    }
}

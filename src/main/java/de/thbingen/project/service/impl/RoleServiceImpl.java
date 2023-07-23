package de.thbingen.project.service.impl;

import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.repository.RoleRepository;
import de.thbingen.project.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public abstract class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;


    @Override
    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public RoleEntity getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

}

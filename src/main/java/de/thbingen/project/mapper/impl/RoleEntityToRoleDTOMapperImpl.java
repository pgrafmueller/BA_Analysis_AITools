package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoleEntityToRoleDTOMapperImpl implements RoleEntityToRoleDTOMapper {

    //read the id from each user entity and add it to a set
    @Override
    public Set<Long> mapUserEntitiesToUserIds(Set<UserEntity> userEntities);

    //map the role entity to a roleDTO by using the other mapping methods and return it
    @Override
    public RoleDTO mapRoleEntityToRoleDTO(RoleEntity roleEntity);
}

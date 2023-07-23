package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class RoleEntityToRoleDTOMapperImpl implements RoleEntityToRoleDTOMapper {


    @Override
    public Set<Long> mapUserEntitiesToUserIds(Set<UserEntity> userEntities) {
        return null;
    }

    @Override
    public RoleDTO mapRoleEntityToRoleDTO(RoleEntity roleEntity) {
        return null;
    }
}

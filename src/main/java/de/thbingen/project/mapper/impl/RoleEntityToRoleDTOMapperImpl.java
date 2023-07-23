package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.RoleEntityToRoleDTOMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleEntityToRoleDTOMapperImpl implements RoleEntityToRoleDTOMapper {

    @Override
    public Set<Long> mapUserEntitiesToUserIds(Set<UserEntity> userEntities) {
        return userEntities.stream().map(UserEntity::getId).collect(Collectors.toSet());
    }

    @Override
    public RoleDTO mapRoleEntityToRoleDTO(RoleEntity roleEntity) {
        return null;
    }
}


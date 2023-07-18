package de.thbingen.project.mapper;

import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.util.Set;

public interface RoleDTOtoRoleEntityMapper {
    Set<UserEntity> mapUserIdsToUserEntities(Set<Long> userIds);

    RoleEntity mapRoleDTOtoRoleEntity(RoleDTO roleDTO);
}

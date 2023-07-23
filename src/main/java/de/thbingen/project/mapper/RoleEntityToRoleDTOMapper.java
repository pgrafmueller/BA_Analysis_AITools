package de.thbingen.project.mapper;

import de.thbingen.project.model.entity.UserEntity;

import java.util.Set;

public interface RoleEntityToRoleDTOMapper {
    Set<Long> mapUserEntitiesToUserIds(Set<UserEntity> userEntities);

}

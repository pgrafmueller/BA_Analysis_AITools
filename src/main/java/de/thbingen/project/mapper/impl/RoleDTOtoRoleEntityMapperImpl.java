package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.RoleDTOtoRoleEntityMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public abstract class RoleDTOtoRoleEntityMapperImpl implements RoleDTOtoRoleEntityMapper {


    //map the roleDTO to a roleEntity by using the other mapping methods and return it
    @Override
    public RoleEntity mapRoleDTOtoRoleEntity(RoleDTO roleDTO) {
        return new RoleEntity(
                roleDTO.getId(),
                roleDTO.getName(),
                mapUserIdsToUserEntities(roleDTO.getUserIds())
        );
    }
}

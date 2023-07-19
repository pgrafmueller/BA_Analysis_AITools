package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.RoleDTOtoRoleEntityMapper;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class RoleDTOtoRoleEntityMapperImpl implements RoleDTOtoRoleEntityMapper {
    private final UserRepository userRepository;

    //map the set of userIds to a set of UserEntities by retrieving the users from the userRepository by their ids
    @Override
    public Set<UserEntity> mapUserIdsToUserEntities(Set<Long> userIds) {
        return userRepository.findAllById(userIds);
    }

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

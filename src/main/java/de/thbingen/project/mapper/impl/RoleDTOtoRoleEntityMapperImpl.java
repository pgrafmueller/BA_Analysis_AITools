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

    @Override
    public Set<UserEntity> mapUserIdsToUserEntities(Set<Long> userIds) {
        return userRepository.findAllById(userIds);
    }

    @Override
    public RoleEntity mapRoleDTOToRoleEntity(RoleDTO roleDTO) {
        return RoleEntity.builder()
                .id(roleDTO.getId())
                .name(roleDTO.getName())
                .userEntities(mapUserIdsToUserEntities(roleDTO.getUserIds()))
                .build();
    }

}

package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.RoleDTOtoRoleEntityMapper;
import de.thbingen.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleDTOtoRoleEntityMapperImpl implements RoleDTOtoRoleEntityMapper {
    private final UserRepository userRepository;


}

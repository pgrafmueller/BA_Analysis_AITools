package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public abstract class OrderDTOtoOrderEntityMapperImpl implements OrderDTOtoOrderEntityMapper {
    private final UserRepository userRepository;

    @Override
    public UserEntity mapUserIdToUserEntity(long userId) {
        return userRepository.findById(userId).orElse(null);
    }

}

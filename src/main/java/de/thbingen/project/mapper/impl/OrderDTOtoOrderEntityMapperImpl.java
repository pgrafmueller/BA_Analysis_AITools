package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.OrderDTOtoOrderEntityMapper;
import de.thbingen.project.model.dto.OrderDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDTOtoOrderEntityMapperImpl implements OrderDTOtoOrderEntityMapper {
    private final UserRepository userRepository;

    //get the user from the userRepository by its id and return it
    @Override
    public UserEntity mapUserIdToUserEntity(long userId) {
        return userRepository.findById(userId).get();
    }

}

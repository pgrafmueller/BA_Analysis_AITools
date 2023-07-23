package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class UserServiceImpl implements UserService {
    private final UserDTOToUserEntityMapper userDTOToUserEntityMapper;
    private final UserRepository userRepository;

    @Override
    public UserEntity saveUser(UserDTO userDTO) {
        return userRepository.save(userDTOToUserEntityMapper.mapUserDTOtoUserEntity(userDTO));
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity updateUser(UserDTO userDTO) {
        return userRepository.save(userDTOToUserEntityMapper.mapUserDTOtoUserEntity(userDTO));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<UserEntity> getUsersByRole(RoleEntity roleEntity) {
        return userRepository.findAllByRolesContaining(roleEntity);
    }

    @Override
    public List<UserEntity> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userRepository.findAllByDateOfBirthBetween(startDate, endDate);
    }
}

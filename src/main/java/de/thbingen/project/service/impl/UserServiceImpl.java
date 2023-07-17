package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserEntityToUserDTOMapper userEntityToUserDTOMapper;
    private final UserDTOToUserEntityMapper userDTOToUserEntityMapper;
    private final UserRepository userRepository;

    @Override
    public UserEntity saveUser(UserDTO userDTO) {
        return userRepository.save(userDTOToUserEntityMapper.mapUserDTOToUserEntity(userDTO));
    }
    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public UserEntity findUserById(Long id) {
        return userRepository.findById(id).get();
    }
    @Override
    public UserEntity updateUser(UserDTO userDTO) {
        return userRepository.save(userDTOToUserEntityMapper.mapUserDTOToUserEntity(userDTO));
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    @Override
    public UserDTO getUserByEmail(String email) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userRepository.findByEmail(email));
    }
    @Override
    public List<UserDTO> getUsersByRole(RoleEntity roleEntity) {
        return userEntityToUserDTOMapper.mapUserEntitiesToUserDTOs(userRepository.findByRole(roleEntity));
    }
    @Override
    public List<UserDTO> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userEntityToUserDTOMapper.mapUserEntitiesToUserDTOs(userRepository.findByDateOfBirthBetween(startDate, endDate));
    }
}

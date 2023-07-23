package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
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
public class UserServiceImpl implements UserService {
    private final UserEntityToUserDTOMapper userEntityToUserDTOMapper;
    private final UserDTOToUserEntityMapper userDTOToUserEntityMapper;
    private final UserRepository userRepository;

    //map the userDTO to a userEntity by using the mapper and save it in the database
    @Override
    public UserEntity saveUser(UserDTO userDTO) {
        return userRepository.save(userDTOToUserEntityMapper.mapUserDTOtoUserEntity(userDTO));
    }

    //get all users from the database and return them
    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    //get the user from the database by its id and return it
    @Override
    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    //map the userDTO to a userEntity by using the mapper and update it in the database
    @Override
    public UserEntity updateUser(UserDTO userDTO) {
        return userRepository.save(userDTOToUserEntityMapper.mapUserDTOtoUserEntity(userDTO));
    }

    //delete the user from the database by its id
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    //get the user from the database by its email and return it
    @Override
    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    //get all users from the database with the given role and return them
    @Override
    public List<UserEntity> getUsersByRole(RoleEntity roleEntity) {
        return userRepository.findAllByRolesContaining(roleEntity);
    }

    //get all users from the database with a date of birth between the given dates and return them
    @Override
    public List<UserEntity> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userRepository.findAllByDateOfBirthBetween(startDate, endDate);
    }
}

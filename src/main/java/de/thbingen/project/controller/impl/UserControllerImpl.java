package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.UserController;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserControllerImpl implements UserController {
    private final UserService userService;
    private final UserEntityToUserDTOMapper userEntityToUserDTOMapper;


    @Override
    public UserDTO createUser(@Valid UserDTO userDto) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.saveUser(userDto));
    }
    @Override
    public List<UserDTO> getAllUsers() {
        return userEntityToUserDTOMapper.mapUserEntityListToUserDTOList(userService.getAllUsers());
    }
    @Override
    public UserDTO getUserById(Long id) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.getUserById(id));
    }
    @Override
    public UserDTO updateUser(Long id, @Valid UserDTO userDto) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.updateUser(userDto));
    }
    @Override
    public UserDTO updateUserAddress(Long id, @Valid Address address) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.updateUserAddress(id, address));
    }
    @Override
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }
    @Override
    public UserDTO getUserByEmail(String email) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.getUserByEmail(email));
    }
    @Override
    public List<UserDTO> getUsersByRoleName(String roleName) {
        return userEntityToUserDTOMapper.mapUserEntityListToUserDTOList(userService.getUsersByRoleName(roleName));
    }
    @Override
    public List<UserDTO> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userEntityToUserDTOMapper.mapUserEntityListToUserDTOList(userService.getUsersByDateOfBirthBetween(startDate, endDate));
    }
}

package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.UserController;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;
import de.thbingen.project.service.RoleService;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserControllerImpl implements UserController {
    private final UserService userService;
    private final RoleService roleService;
    private final UserEntityToUserDTOMapper userEntityToUserDTOMapper;

    //call the userService to save the user
    @Override
    public UserDTO createUser(@Valid UserDTO userDto) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.saveUser(userDto));
    }

    //call the userService to get all users
    @Override
    public List<UserDTO> getAllUsers() {
        return userEntityToUserDTOMapper.mapUserEntitiesToUserDTOs(userService.getAllUsers());
    }

    //call the userService to get the user by its id
    @Override
    public UserDTO getUserById(Long id) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.getUserById(id));
    }

    //call the userService to update the user
    @Override
    public UserDTO updateUser(Long id, @Valid UserDTO userDto) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.updateUser(userDto));
    }

    //call the userService to get the user with the corresponding id
    //if the user is null return null
    //if the user exists update its existing address with the new one
    //call the userService to save the user with the updated address
    @Override
    public UserDTO updateUserAddress(Long id, @Valid Address address) {
        UserDTO userDto = userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.getUserById(id));
        if (userDto == null) {
            return null;
        }
        userDto.setAddress(address);
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.saveUser(userDto));
    }

    //call the userService to delete the user
    @Override
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

    //call the userService to get the user by its email
    @Override
    public UserDTO getUserByEmail(String email) {
        return userEntityToUserDTOMapper.mapUserEntityToUserDTO(userService.getUserByEmail(email));
    }

    //call the roleService to get the role by its name
    //if the role does not exist return an empty list
    //call the userService to get all users with the role
    @Override
    public List<UserDTO> getUsersByRoleName(String roleName) {
        if (roleService.getRoleByName(roleName) == null) {
            return null;
        }
        return userEntityToUserDTOMapper.mapUserEntitiesToUserDTOs(userService.getUsersByRoleName(roleName));
    }

    //call the userService to get all users with a date of birth between the start and end date
    @Override
    public List<UserDTO> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userEntityToUserDTOMapper.mapUserEntitiesToUserDTOs(userService.getUsersByDateOfBirthBetween(startDate, endDate));
    }
}

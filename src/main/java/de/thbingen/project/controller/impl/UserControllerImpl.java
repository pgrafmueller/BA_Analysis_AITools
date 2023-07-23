package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.UserController;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.service.RoleService;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

}

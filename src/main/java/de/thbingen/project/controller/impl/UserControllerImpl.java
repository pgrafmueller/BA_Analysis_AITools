package de.thbingen.project.controller.impl;

import de.thbingen.project.controller.UserController;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserControllerImpl implements UserController {
    private final UserService userService;
    private final UserEntityToUserDTOMapper userEntityToUserDTOMapper;

    @Override
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

}

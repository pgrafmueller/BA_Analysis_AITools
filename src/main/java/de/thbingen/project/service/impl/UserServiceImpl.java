package de.thbingen.project.service.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserEntityToUserDTOMapper userEntityToUserDTOMapper;
    private final UserDTOToUserEntityMapper userDTOToUserEntityMapper;
    private final UserRepository userRepository;
}

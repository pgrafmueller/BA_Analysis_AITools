package de.thbingen.project.service.impl;

import de.thbingen.project.service.OrderService;
import de.thbingen.project.service.RoleService;
import de.thbingen.project.service.UserService;
import de.thbingen.project.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ValidationServiceImpl implements ValidationService {
    private final UserService userService;
    private final OrderService orderService;
    private final RoleService roleService;

}

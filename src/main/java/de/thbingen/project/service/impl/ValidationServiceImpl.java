package de.thbingen.project.service.impl;

import de.thbingen.project.errorhandler.exception.GenericValidationException;
import de.thbingen.project.model.dto.RoleDTO;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.service.ValidationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public abstract class ValidationServiceImpl implements ValidationService {


    //validate if the user is not null and if the email of the user is unique
    @Override
    public void validateUserUniqueEmail(UserDTO userDTO) throws GenericValidationException {

        if (userDTO == null) {
            throw new GenericValidationException("User must not be null");
        }
        if (userDTO.getEmail() == null) {
            throw new GenericValidationException("Email must not be null");
        }
    }


    //validate if the role is not null and if the name of the role is unique
    @Override
    public void validateRoleUniqueName(RoleDTO roleDTO) throws GenericValidationException {
        if (roleDTO == null) {
            throw new GenericValidationException("Role must not be null");
        }
        if (roleDTO.getName() == null) {
            throw new GenericValidationException("Name must not be null");
        }
    }
}

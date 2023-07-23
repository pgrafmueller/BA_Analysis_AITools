package de.thbingen.project.controller;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface UserController {

    void deleteUser(Long id);

}

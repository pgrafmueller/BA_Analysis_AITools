package de.thbingen.project.service.impl;

import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.UserRepository;
import de.thbingen.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

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

    //get all users from the database with a date of birth between the given dates and return them
    @Override
    public List<UserEntity> getUsersByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return userRepository.findAllByDateOfBirthBetween(startDate, endDate);
    }
}

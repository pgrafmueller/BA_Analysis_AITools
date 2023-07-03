package de.thbingen.project.repository;

import de.thbingen.project.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findUserByEmail(String email);

    List<UserEntity> findUsersByRoleName(String roleName);

    List<UserEntity> findUsersByDateOfBirthBetween(LocalDate startDate, LocalDate endDate);

}

package de.thbingen.project.repository;

import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);

    List<UserEntity> findAllByRolesContaining(RoleEntity roleEntity);

    List<UserEntity> findAllByDateOfBirthBetween(LocalDateTime startDate, LocalDateTime endDate);
}

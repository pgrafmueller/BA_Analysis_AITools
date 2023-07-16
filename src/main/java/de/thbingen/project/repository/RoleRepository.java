package de.thbingen.project.repository;

import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
    RoleEntity findRoleByName(String roleName);

    List<UserEntity> findUsersByRoleContains(RoleEntity role);
}

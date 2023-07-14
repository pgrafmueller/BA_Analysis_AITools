package de.thbingen.project.mapper;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface UserEntityToUserDTOMapper {
    String mapFirstAndLastNameToFullName(String firstName, String lastName);

    String decodeBase64EncodedPassword(String password);

    String mapPhoneNumbersListToPhoneNumbersString(List<String> phoneNumbers);

    Set<Long> mapRoleEntitiesToRoleIds(Set<RoleEntity> roleEntities);

    List<Long> mapOrderEntitiesToOrderIds(List<OrderEntity> orderEntities);

    String mapLocalDateTimeToString(LocalDateTime dateTime);

    UserDTO mapUserEntityToUserDTO(UserEntity userEntity);
}

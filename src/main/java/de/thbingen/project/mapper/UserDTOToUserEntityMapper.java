package de.thbingen.project.mapper;

import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface UserDTOToUserEntityMapper {
    String mapNameToFirstName(String name);

    String mapNameToLastName(String name);

    String encodePassword(String password);

    List<String> mapPhoneNumbersListToPhoneNumbers(String phoneNumbersList);

    Set<RoleEntity> mapRoleIdsToRoleEntities(Set<Long> roleIds);

    List<OrderEntity> mapOrderIdsToOrderEntities(List<Long> orderIds);

    LocalDateTime mapDateOfBirthStringToLocalDateTime(String dateTime);

    Address mapAddressDTOtoAddressEmbeddable(String street, String city, String state, String zip);

    UserEntity mapUserDTOtoUserEntity(UserDTO userDTO);
}

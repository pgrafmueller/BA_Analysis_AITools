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
    String mapNameDTOToNameEmbeddable(String firstName, String lastName);

    String encodePassword(String password);

    UserEntity.Gender mapGenderStringToGenderEnum(String gender);

    String mapPhoneNumbersListToPhoneNumbers(List<String> phoneNumbersList);

    Set<RoleEntity> mapRoleIdsToRoleEntities(Set<Long> roleIds);

    List<OrderEntity> mapOrderIdsToOrderEntities(List<Long> orderIds);

    LocalDateTime mapStringToLocalDateTime(String dateTime);

    Address mapAddressDTOToAddressEmbeddable(String street, String city, String state, String zip);

    UserEntity mapUserDTOToUserEntity(UserDTO userDTO);
}

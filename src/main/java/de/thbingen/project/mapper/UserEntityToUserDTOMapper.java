package de.thbingen.project.mapper;

import de.thbingen.project.model.entity.OrderEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface UserEntityToUserDTOMapper {
    String mapFirstAndLastNameToFullName(String firstName, String lastName);

    String decodeBase64EncodedPassword(String password);

    String mapPhoneNumbersListToPhoneNumbersString(List<String> phoneNumbers);

    List<Long> mapOrderEntitiesToOrderIds(List<OrderEntity> orderEntities);

    String mapLocalDateTimeToString(LocalDateTime dateTime);

}

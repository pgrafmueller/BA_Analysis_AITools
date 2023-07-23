package de.thbingen.project.mapper;

import de.thbingen.project.model.embeddable.Address;
import de.thbingen.project.model.entity.OrderEntity;

import java.time.LocalDateTime;
import java.util.List;

public interface UserDTOToUserEntityMapper {
    String mapNameToFirstName(String name);

    String mapNameToLastName(String name);

    String encodePassword(String password);

    List<String> mapPhoneNumbersListToPhoneNumbers(String phoneNumbersList);


    List<OrderEntity> mapOrderIdsToOrderEntities(List<Long> orderIds);

    LocalDateTime mapDateOfBirthStringToLocalDateTime(String dateTime);

    Address mapAddressDTOToAddressEmbeddable(String street, String city, String state, String zip);

}

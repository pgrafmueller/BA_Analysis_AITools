package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.model.entity.OrderEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserEntityToUserDTOMapperImpl implements UserEntityToUserDTOMapper {

    @Override
    public String mapFirstAndLastNameToFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    @Override
    public String decodeBase64EncodedPassword(String password) {
        return new String(java.util.Base64.getDecoder().decode(password));
    }

    @Override
    public String mapPhoneNumbersListToPhoneNumbersString(List<String> phoneNumbers) {
        StringBuilder sb = new StringBuilder();
        phoneNumbers.forEach(phoneNumber -> sb.append(phoneNumber).append(", "));
        return sb.toString();
    }


    @Override
    public List<Long> mapOrderEntitiesToOrderIds(List<OrderEntity> orderEntities) {
        return orderEntities.stream().map(OrderEntity::getId).toList();
    }

    @Override
    public String mapLocalDateTimeToString(LocalDateTime dateTime) {
        return dateTime.toString();
    }


}

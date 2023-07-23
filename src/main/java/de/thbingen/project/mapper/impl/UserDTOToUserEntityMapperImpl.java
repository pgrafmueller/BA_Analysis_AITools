package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.model.embeddable.Address;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDTOToUserEntityMapperImpl implements UserDTOToUserEntityMapper {
    private final RoleRepository roleRepository;
    private final OrderRepository orderRepository;

    //split the name string into first and last name and return the first name
    @Override
    public String mapNameToFirstName(String name) {
        return name.split(" ")[0];
    }

    //split the name string into first and last name and return the last name
    @Override
    public String mapNameToLastName(String name) {
        return name.split(" ")[1];
    }

    //encode the password with Base64 and return it
    @Override
    public String encodePassword(String password) {
        return java.util.Base64.getEncoder().encodeToString(password.getBytes());
    }

    //split the phone numbers string into a list of phone numbers and return it
    @Override
    public List<String> mapPhoneNumbersListToPhoneNumbers(String phoneNumbersList) {
        return List.of(phoneNumbersList.split(","));
    }


    //map the list of orderIds to a list of OrderEntities by retrieving the orders from the orderRepository by their ids
    @Override
    public List<OrderEntity> mapOrderIdsToOrderEntities(List<Long> orderIds) {
        return orderRepository.findAllById(orderIds);
    }

    //map the dateOfBirth string to a LocalDateTime object and return it
    @Override
    public LocalDateTime mapDateOfBirthStringToLocalDateTime(String dateTime) {
        return LocalDateTime.parse(dateTime);
    }

    //map the addressDTO to an addressEmbeddable and return it
    @Override
    public Address mapAddressDTOtoAddressEmbeddable(String street, String city, String state, String zip) {
        return new Address(
                street,
                city,
                state,
                zip
        );
    }


}

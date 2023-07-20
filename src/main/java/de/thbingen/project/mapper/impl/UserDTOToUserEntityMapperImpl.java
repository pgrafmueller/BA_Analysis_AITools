package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.UserDTOToUserEntityMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.embeddable.Address;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import de.thbingen.project.repository.OrderRepository;
import de.thbingen.project.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserDTOToUserEntityMapperImpl implements UserDTOToUserEntityMapper {
    private final RoleRepository roleRepository;
    private final OrderRepository orderRepository;

    @Override
    public String mapNameToFirstName(String name) {
        return name.split(" ")[0];
    }

    @Override
    public String mapNameToLastName(String name) {
        return name.split(" ")[1];
    }

    @Override
    public String encodePassword(String password) {
        return password;
    }

    @Override
    public List<String> mapPhoneNumbersListToPhoneNumbers(String phoneNumbersList) {
        return List.of(phoneNumbersList.split(","));
    }


    @Override
    public List<OrderEntity> mapOrderIdsToOrderEntities(List<Long> orderIds) {
        return orderRepository.findAllById(orderIds);
    }

    @Override
    public LocalDateTime mapDateOfBirthStringToLocalDateTime(String dateTime){
        return LocalDateTime.parse(dateTime);
    }

    @Override
    public Address mapAddressDTOToAddressEmbeddable(String street, String city, String state, String zip){
        return new Address(street, city, state, zip);
    }

}

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

    //map the set of roleIds to a set of RoleEntities by retrieving the roles from the roleRepository by their ids
    @Override
    public Set<RoleEntity> mapRoleIdsToRoleEntities(Set<Long> roleIds) {
        return roleRepository.findAllById(roleIds);
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

    //map the userDTO to a userEntity by using the other mapping methods and return it
    @Override
    public UserEntity mapUserDTOtoUserEntity(UserDTO userDTO) {
        return new UserEntity(
                userDTO.getId(),
                mapNameToFirstName(userDTO.getName()),
                mapNameToLastName(userDTO.getName()),
                encodePassword(userDTO.getPassword()),
                mapPhoneNumbersListToPhoneNumbers(userDTO.getPhoneNumbers()),
                mapRoleIdsToRoleEntities(userDTO.getRoleIds()),
                mapOrderIdsToOrderEntities(userDTO.getOrderIds()),
                mapDateOfBirthStringToLocalDateTime(userDTO.getDateOfBirth()),
                mapAddressDTOtoAddressEmbeddable(
                        userDTO.getAddress().getStreet(),
                        userDTO.getAddress().getCity(),
                        userDTO.getAddress().getState(),
                        userDTO.getAddress().getZip()
                )
        );
    }

}

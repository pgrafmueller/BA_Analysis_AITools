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
    public String mapNameToFirstName(String name);

    //split the name string into first and last name and return the last name
    @Override
    public String mapNameToLastName(String name);

    //encode the password with base64 and return it
    @Override
    public String encodePassword(String password);

    //split the phone numbers string into a list of phone numbers and return it
    @Override
    public List<String> mapPhoneNumbersListToPhoneNumbers(String phoneNumbersList);

    //map the set of roleIds to a set of RoleEntities by retrieving the roles from the roleRepository by their ids
    @Override
    public Set<RoleEntity> mapRoleIdsToRoleEntities(Set<Long> roleIds);

    //map the list of orderIds to a list of OrderEntities by retrieving the orders from the orderRepository by their ids
    @Override
    public List<OrderEntity> mapOrderIdsToOrderEntities(List<Long> orderIds);

    //map the dateOfBirth string to a LocalDateTime object and return it
    @Override
    public LocalDateTime mapDateOfBirthStringToLocalDateTime(String dateTime);

    //map the addressDTO to an addressEmbeddable and return it
    @Override
    public Address mapAddressDTOtoAddressEmbeddable(String street, String city, String state, String zip);

    //map the userDTO to a userEntity by using the other mapping methods and return it
    @Override
    public UserEntity mapUserDTOtoUserEntity(UserDTO userDTO);

}

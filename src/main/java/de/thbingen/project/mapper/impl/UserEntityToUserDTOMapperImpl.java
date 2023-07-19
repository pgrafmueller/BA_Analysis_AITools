package de.thbingen.project.mapper.impl;

import de.thbingen.project.mapper.UserEntityToUserDTOMapper;
import de.thbingen.project.model.dto.UserDTO;
import de.thbingen.project.model.entity.OrderEntity;
import de.thbingen.project.model.entity.RoleEntity;
import de.thbingen.project.model.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Service
public class UserEntityToUserDTOMapperImpl implements UserEntityToUserDTOMapper {

    //concatenate the first and last name and return it
    @Override
    public String mapFirstAndLastNameToFullName(String firstName, String lastName);

    //decode the password with base64 and return it
    @Override
    public String decodeBase64EncodedPassword(String password);

    //concatenate the phone number in the list and return it
    @Override
    public String mapPhoneNumbersListToPhoneNumbersString(List<String> phoneNumbers);

    //read the ids from the roleEntities and return them in a set
    @Override
    public Set<Long> mapRoleEntitiesToRoleIds(Set<RoleEntity> roleEntities);

    //read the ids from the orderEntities and return them in a list
    @Override
    public List<Long> mapOrderEntitiesToOrderIds(List<OrderEntity> orderEntities);

    //map the LocalDateTime object to a string and return it
    @Override
    public String mapLocalDateTimeToString(LocalDateTime dateTime);

    //map the userEntity to a userDTO by using the other mapping methods and return it
    @Override
    public UserDTO mapUserEntityToUserDTO(UserEntity userEntity);
}

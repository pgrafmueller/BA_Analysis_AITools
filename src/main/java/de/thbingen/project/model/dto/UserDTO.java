package de.thbingen.project.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Street cannot be empty")
    private String street;

    @NotEmpty(message = "City cannot be empty")
    private String city;

    @NotEmpty(message = "State cannot be empty")
    private String state;

    @NotEmpty(message = "Zip code cannot be empty")
    @Pattern(regexp = "\\d{5}", message = "Zip code should be 5 digits")
    private String zip;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Phone numbers cannot be empty")
    private String phoneNumbers;

    @NotEmpty(message = "Gender cannot be empty")
    @Pattern(regexp = "MALE|FEMALE|OTHER", flags = Pattern.Flag.CASE_INSENSITIVE, message = "Invalid gender")
    private String gender;

    @NotEmpty(message = "Date of birth cannot be empty")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth must be in the format yyyy-MM-dd")
    private String dateOfBirth;

    @NotEmpty(message = "Order IDs cannot be empty")
    private List<Long> orderIds;

    @NotEmpty(message = "Role IDs cannot be empty")
    private Set<Long> roleIds;

    @NotEmpty(message = "Password cannot be empty")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}$",
            message = "Password must contain at least one uppercase, one lowercase letter, a number, and a special character")
    private String password;
}
package de.thbingen.project.model.entity;

import de.thbingen.project.model.embeddable.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @Embedded
    private Address address;    // street, city, state, zip in entity converted to Address

    @ElementCollection
    private List<String> phoneNumbers; // List of phone numbers

    @Enumerated(EnumType.STRING)
    private Gender gender;  // String converted to Enum

    private LocalDateTime dateOfBirth; // String converted to LocalDateTime

    @OneToMany(mappedBy = "user")
    private List<OrderEntity> orders;   // List of OrderEntities converted from List of IDs

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<RoleEntity> roles;

    private String hashedPassword; // base64 encoded hash of the plain-text password

    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
}

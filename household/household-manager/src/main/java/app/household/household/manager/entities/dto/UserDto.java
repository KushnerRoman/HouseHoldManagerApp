package app.household.household.manager.entities.dto;

import app.household.household.manager.entities.User;
import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link User} entity
 */
@Data
public class UserDto implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
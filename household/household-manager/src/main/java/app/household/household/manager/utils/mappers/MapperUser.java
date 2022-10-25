package app.household.household.manager.utils.mappers;

import app.household.household.manager.entities.User;
import app.household.household.manager.entities.dto.UserDto;
import app.household.household.manager.requests.auth.RegistrationRequest;
import org.springframework.stereotype.Component;

@Component
public class MapperUser {

    public User mapRegistrationRequestToUser(String firstName, String lastName, String password, String email) {
        return  User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .build();
    }

    public UserDto mapUserToUserDto(User user) {
        return new UserDto(
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword()
        );

    }

    }





package app.household.household.manager.services.authService;


import app.household.household.manager.entities.User;
import app.household.household.manager.entities.dto.UserDto;
import app.household.household.manager.exceptions.EmailAlreadyExistException;
import app.household.household.manager.exceptions.EmailNotValidException;
import app.household.household.manager.exceptions.UserNameException;
import app.household.household.manager.repository.authRepository.AuthRepository;
import app.household.household.manager.response.auth.RegistrationResponse;
import app.household.household.manager.utils.mappers.MapperUser;
import app.household.household.manager.utils.validators.EmailValidator;
import app.household.household.manager.utils.validators.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private MapperUser mapperUser;
    @Autowired
    private EmailValidator emailValidator;
    @Autowired
    private UserValidator userValidator;
    @Autowired
    private  PasswordEncoder encoder;
    @Autowired
    private AuthRepository authRepository;

    public RegistrationResponse createNewUser(String firstName,String lastName, String password, String email) throws EmailAlreadyExistException, EmailNotValidException, UserNameException {



        if (!emailValidator.test(email)) {
            throw new EmailNotValidException();
        }
        if(!userValidator.test(firstName)&& !userValidator.test(lastName)) {
            throw new UserNameException();
        }
        if (authRepository.existsByEmail(email)) {
            throw new EmailAlreadyExistException();
        }

            User user = mapperUser.mapRegistrationRequestToUser(firstName,lastName, encoder.encode(password),email);
            UserDto userDto=mapperUser.mapUserToUserDto(authRepository.save(user));
            return new RegistrationResponse("User registered successfully", true, userDto);

        }


}

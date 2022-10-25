package app.household.household.manager.restControllers.authContoller;


import app.household.household.manager.exceptions.EmailAlreadyExistException;
import app.household.household.manager.exceptions.EmailNotValidException;
import app.household.household.manager.exceptions.UserNameException;
import app.household.household.manager.response.auth.RegistrationResponse;
import app.household.household.manager.services.authService.AuthService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authControllerService;

    @PostMapping("/register")
    @ApiOperation(value = "Register new user",response = RegistrationResponse.class)
        @ApiResponses(value = {
                @ApiResponse(code = 201, message = "Successfully registered user"),
                @ApiResponse(code = 400, message = "Bad request"),
                @ApiResponse(code = 404, message = "Error during registration")
        })
    public ResponseEntity<RegistrationResponse> createNewUser(@ApiParam(required = true)  @RequestParam String firstName,
                                                              @ApiParam(required = true)   @RequestParam String lastName,
                                                              @ApiParam(required = true)   @RequestParam String password,
                                                              @ApiParam(required = true)  @RequestParam String email)
            throws EmailAlreadyExistException, EmailNotValidException {
        try {
            return new ResponseEntity<RegistrationResponse>(authControllerService.createNewUser(firstName, lastName, password, email), HttpStatus.CREATED);
        } catch (EmailAlreadyExistException  e) {
            return new ResponseEntity<RegistrationResponse>(new RegistrationResponse(e.getMessage(), false, null), HttpStatus.valueOf(400));
        } catch (EmailNotValidException | UserNameException e) {
            return new ResponseEntity<RegistrationResponse>(new RegistrationResponse(e.getMessage(), false, null), HttpStatus.valueOf(404));
        }
    }

    }








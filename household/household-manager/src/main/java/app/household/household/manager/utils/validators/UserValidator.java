package app.household.household.manager.utils.validators;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class UserValidator {

    private final String name_pattern = "^[A-Z][a-z]$";


    public boolean test(String name) {
        return Pattern.compile(name_pattern).matcher(name).matches();
    }

}

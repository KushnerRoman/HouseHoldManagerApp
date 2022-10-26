package app.household.household.manager.utils.validators;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;

@Component
public class UserValidator {

    private final String name_pattern = "[A-Za-z'èé\\s\\-]*";


    public boolean test(String name) {
        System.out.println(name);
        return Pattern.compile(name_pattern).matcher(name).matches();
    }

}

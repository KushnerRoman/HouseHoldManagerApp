package app.household.household.manager.exceptions;

public class UserNameException extends Exception {

    public UserNameException() {
        super("Last name and first name must be valid ! no special characters allowed");
    }

    public UserNameException(String message) {
        super("Last name and first name must be valid ! no special characters allowed");
    }

    public UserNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNameException(Throwable cause) {
        super(cause);
    }
}

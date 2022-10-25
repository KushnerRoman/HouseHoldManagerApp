package app.household.household.manager.exceptions;

public class EmailAlreadyExistException extends Exception {

    private final int code=400;



    public EmailAlreadyExistException() {
        super("Email already exist");
    }



    public EmailAlreadyExistException(String message) {
        super(message);
    }

    public EmailAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailAlreadyExistException(Throwable cause) {
        super(cause);
    }
}

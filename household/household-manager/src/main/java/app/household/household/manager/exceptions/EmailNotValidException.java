package app.household.household.manager.exceptions;

public class EmailNotValidException extends Exception {

    private final int code=404;
    public EmailNotValidException() {
        super("Error : Email not valid");
    }

    public EmailNotValidException(String message) {
        super(message);
    }

    public EmailNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailNotValidException(Throwable cause) {
        super(cause);
    }
}

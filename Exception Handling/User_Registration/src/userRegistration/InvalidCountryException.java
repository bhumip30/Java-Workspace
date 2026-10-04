package userRegistration;

public class InvalidCountryException extends Exception {

	public InvalidCountryException(String message) {
        super(message);
    }

    public InvalidCountryException() {
        super("Invalid Country Exception");
    }

}

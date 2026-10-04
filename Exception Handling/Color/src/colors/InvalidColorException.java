package colors;

public class InvalidColorException extends Exception {

	public InvalidColorException() {
		super("Invalid Argument");
	}

	public InvalidColorException(String message) {
		super(message);
		
	}


}

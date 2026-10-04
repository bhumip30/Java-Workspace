package userRegistration;

public class user_main {

	public static void main(String[] args) {
		 UserRegistration ur = new UserRegistration();

	        try {
	           
	            ur.registerUser("Bhumika", "India");

	            
	            ur.registerUser("Alex", "USA");

	        }
	        catch (InvalidCountryException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}



package customer_collection;

public class RegisteredCustomer extends Customer {
	
	private int regno;

	public RegisteredCustomer() {
		
	}

	public RegisteredCustomer(String name, String email, int contact, int regno) {
		super(name, email, contact);
		this.regno = regno;
	}

	public void display() {
		System.out.println("Registed Customer number: " + regno);
	}

}

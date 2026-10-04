package customer_collection;

import java.io.Serializable;

public class Customer implements Serializable {
	private String name;
	private String email;
	private int contact;
	
	public Customer() {
		super();
	}

	public Customer(String name, String email, int contact) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
	}
	
	public void display() {
		System.out.println("Customer Name: "+ name + 
				"Customer email: " + email + 
				"Customer Contact: " + contact);
	}
	
}

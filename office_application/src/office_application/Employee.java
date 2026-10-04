package office_application;

public class Employee extends Person {
	private int id;
	private String name;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
		
	}

	public Employee(int id,String name, double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public void display() {
		super.display();
		System.out.println("Person ID: " + id);
		System.out.println("Person salary: " + salary);
		
	}
	

}

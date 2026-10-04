package app;

public class Employee {
	int id; 
	String name;
	String dept;  
	int salary ;
	String location;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, String dept, int salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + 
				"name=" + name + 
				"dept=" + dept + 
				"salary=" + salary +
				"location=" + location;
	}
	
	

}

package utility;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	protected double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
		
	}

	public Employee(int id,String name, double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	public String toString() {
		return "\nEmployee id: " + id +
	               "\nEmployee Name: " + name +
	               "\nEmployee Salary: " + salary;
	}
	
	public void display() {
		System.out.println("Employee ID: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}
	
	public double calSalary() {
		return salary;
	}

}

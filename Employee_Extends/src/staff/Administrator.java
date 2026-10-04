package staff;

import utility.Employee;

public class Administrator extends Employee {
	private double allowance;
	private double bonus;

	public Administrator() {
		// TODO Auto-generated constructor stub
	}

	public Administrator(int id, String name, double salary, double allowance, double bonus) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
		this.allowance = allowance;
		this.bonus = bonus;
	}
	
	public double getAllowance() {
		return allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAdministrator allowance: " + allowance +
				"\nAdministrator bonus: " + bonus;
	}
	
	public void display() {
		super.display();
		System.out.println("Administrator allowance: " + allowance);
		System.out.println("Administrator bonus: " + bonus);
	}
	
	public double calSalary() {
		return super.calSalary() + bonus;
	}

}

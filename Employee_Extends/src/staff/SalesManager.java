package staff;

import utility.Employee;
import utility.ITraveller;

public class SalesManager extends Employee implements ITraveller {
	private double salesTarget;
	private double perCommision;
	private String pass_no;
	private int travelHr;
	
	public SalesManager() {
		
	}

	public SalesManager(int id, String name, double salary, double salesTarget, double perCommision, String pass_no,
			int travelHr) {
		super(id, name, salary);
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
		this.pass_no = pass_no;
		this.travelHr = travelHr;
	}

	public double getSalesTarget() {
		return salesTarget;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSales Target: " + salesTarget + "\nCommision: " + perCommision;
	}
	
	public void display() {
		super.display();
		System.out.println("Sales Target: " + salesTarget);
		System.out.println("Commision: " + perCommision);
	}

	public double calSalary() {
		return super.calSalary() + salesTarget*(perCommision/100);
	}

	@Override
	public String getPassportDetails() {
		// TODO Auto-generated method stub
		return pass_no;
	}

	@Override
	public int getTravelHr() {
		// TODO Auto-generated method stub
		return travelHr;
	}
	
	
	
	
	

}

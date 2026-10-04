package staff;

import utility.Employee;
import utility.ITraveller;

public class Programmer extends Employee implements ITraveller {
	private String projectTitle;
	private int extraHr;
	private double charges_per_extraHr;
	private String pass_no;
	private int travelHr;

	public Programmer() {
		// TODO Auto-generated constructor stub
	}

	public Programmer(int id, String name, double salary, String projectTitle, int extraHr, double charges_per_extraHr,
			String pass_no, int travelHr) {
		super(id, name, salary);
		this.projectTitle = projectTitle;
		this.extraHr = extraHr;
		this.charges_per_extraHr = charges_per_extraHr;
		this.pass_no = pass_no;
		this.travelHr = travelHr;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	@Override
	public String toString() {
		return super.toString() +"\nProject Title: " + projectTitle + 
				"\nProgrammers Extra Hours: " + extraHr + 
				"\nProgrammers charges per hour: " + charges_per_extraHr;
	}
	
	public void display() {
		super.display();
		System.out.println("Project Title: " + projectTitle);
		System.out.println("Programmers Extra Hours: " + extraHr);
		System.out.println("Programmers charges per hour: " + charges_per_extraHr);
	}
	
	public double calSalary() {
		return super.calSalary() + (extraHr * charges_per_extraHr );
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

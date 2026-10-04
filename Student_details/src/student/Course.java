package student;

import java.io.Serializable;

public class Course extends Student implements Serializable {
	private int curid;
	private String curname;
	private double fees;
	
	public Course() {
		super();
	}

	public Course(String name, Date dob, int pRN, String cource_name, int age, int curid, String curname, double fees) {
		super(name, dob, pRN, cource_name, age);
		this.curid = curid;
		this.curname = curname;
		this.fees = fees;
	}
	
	public void display() {
		System.out.println("Course ID: " + curid +
				"Course Name: " + curname +
				"Course fees: " + fees);
	}

}

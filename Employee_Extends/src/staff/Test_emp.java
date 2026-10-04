package staff;

import utility.Employee;
import utility.ITraveller;

public class Test_emp {
	
	

	//_____________Downcasting - use instnce of_____________
	/*static void ShowMoreDetails(Employee [] allemps) {
		for(Employee e : allemps) {
			
			if (e instanceof SalesManager)
				System.out.println("Sales Target: "+((SalesManager)e).getSalesTarget());
			
			if(e instanceof Programmer)
				System.out.println("Project Title: " + ((Programmer)e).getProjectTitle());
			
			if(e instanceof Administrator)
				System.out.println("Administrator allowance: " + ((Administrator)e).getAllowance());
			
		}
	}*/
	
	static void ShowTravelDetails(Employee [] allemps) {
		int total_hr = 0;
		for (Employee e : allemps) {
			if (e instanceof ITraveller)
				//ITraveller t = (ITraveller)e;
				System.out.println(((ITraveller)e).getTravelHr());
				System.out.println(((ITraveller)e).getPassportDetails());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SalesManager sm = new SalesManager(101, "Aarya", 500000.00, 1000.00, 100.00 );
		
		Programmer p = new Programmer(201, "Bhumi", 432525.00, "Library Management", 2, 500.00);
		
		Administrator a = new Administrator(302, "Shruti", 600034.00, 30000.00);*/
		
		/*System.out.println("Sales Manager Details: ");
		sm.display();
		
		System.out.println("Programmer Details: ");
		p.display();
		
		System.out.println("Administration Details: ");
		a.display();*/
		
		Employee [] allemps;
		allemps = new Employee[3];
		allemps[0] = new SalesManager(401, "Aarya", 900000.00, 1000.00, 100.00, null, 0);
		allemps[1] = new Programmer(201, "Ayush", 40000.00, "Transport Management", 5, 100.00,
				"AB101", 10);
		allemps[2] = new Administrator(902, "Shruti", 600034.00, 30000.00, 20000.00);
		
		//run time polymorphism
		for(int i=0; i<allemps.length; i++ ) {
			System.out.println(allemps[i]);
			System.out.println("*******************");
		}
		
		//_________toString()_______________
		
		/*System.out.println("Sales Manager Details: ");
		System.out.println(sm);
		System.out.println("*******************");
		
		System.out.println("Programmer Details: ");
		System.out.println(p);
		System.out.println("*******************");
		
		System.out.println("Administration Details: ");
		System.out.println(a);
		System.out.println("*******************");*/
		
		//____________Method calSal() override __________________
		
		/*double sum = 0;
		for(Employee e  : allemps) {
			sum+=e.calSalary();
			System.out.println("salary : "+e.calSalary());   
		}
		System.out.println("Total salary : "+sum);*/
		
		//_____________Downcasting - use instnce of_____________
		//ShowMoreDetails(allemps);
	}

}

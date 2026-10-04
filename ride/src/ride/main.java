package ride;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeRide b1 = new BikeRide(101, "Aarya Patil", "MH2101", true);
		
		CarRide c1 = new CarRide(201, "Dhruv Patil", "MH8714", 5, true);
		
		/*System.out.println("____Display Bike Details: ____ ");
		b1.display();
		
		System.out.println("____Display Car Details: ____ ");
		c1.display();*/
		
		System.out.println("Bike Basefare Details: "+ b1.calFare(100));
		
		System.out.println("Car Basefare Details: "+c1.calFare(545));
		
		
	}

}

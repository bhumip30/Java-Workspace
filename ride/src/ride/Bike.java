package ride;

public abstract class Bike {
	protected int rideID;
	protected String cusName;
		
	public Bike() {
		this.rideID = 0;
		this.cusName = " ";
	}

	public Bike(int rideID, String cusName) {
		this.rideID = rideID;
		this.cusName = cusName;
	}
	
	public void display() {
		System.out.println("The bike id: "+ rideID);
		System.out.println("The bikes customer name: "+ cusName);
	}
	
	public abstract float calFare(float distance);

}

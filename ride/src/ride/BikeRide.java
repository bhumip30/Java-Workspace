package ride;

public class BikeRide extends Bike {
	private String bikeNo;
	private boolean Helmetprovide;
	protected static double chargeperKM = 10;

	public BikeRide() {
		// TODO Auto-generated constructor stub
		super();
	}

	public BikeRide(int rideID, String cusName, String bikeNo, boolean aCprovide) {
		super(rideID, cusName);
		this.bikeNo = bikeNo;
		this.Helmetprovide = aCprovide;
	}
	
	public void display() {
		super.display();
		System.out.println("The bike number: "+ bikeNo);
		System.out.println("The bike provide Helmet: "+ Helmetprovide);
	}
	
	public float calFare(float distance) {
		float basefare = (float) (distance * chargeperKM);
		if (Helmetprovide == true) {
			basefare = basefare + 50;
		}
		return basefare;
	}
}

package ride;

public class CarRide extends Bike {
	private String carNo;
	private int seat_capasity;
	private boolean ACavailable;
	protected static double chargeperKM = 18;

	public CarRide() {
		// TODO Auto-generated constructor stub
	}

	public CarRide(int rideID, String cusName, String carNo, int seat_capasity, boolean aCavailable) {
		super(rideID, cusName);
		this.carNo = carNo;
		this.seat_capasity = seat_capasity;
		ACavailable = aCavailable;
	}
	
	public void display(){
		System.out.println("The car number: "+ carNo);
		System.out.println("The car seats: "+ seat_capasity);
		System.out.println("The car has AC?: "+ ACavailable);
	}
	
	public float calFare(float distance) {
		float basefare = (float) (distance * chargeperKM);
		if (ACavailable == true) {
			basefare = basefare + (basefare + 3);
		}
		return basefare;
	}

}

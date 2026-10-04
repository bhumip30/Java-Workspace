package custome;

public enum OrderStatus {
	CREATED(10), CONFIRMED(20), PROCESSING(30), SHIPPED(40), DELIVERED(50);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public void m1(){
		
	}
}

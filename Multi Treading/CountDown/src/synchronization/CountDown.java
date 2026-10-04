package synchronization;

public class CountDown implements Runnable {
	private Thread t;
	String name;
	int num;
	
	
	public CountDown(String name, int num) {
		super();
		this.t = new Thread (this);
		this.name = name;
		this.num = num;
		
	}


	@Override
	public void run() {
		while (num > 0) {
			System.out.println(name + "Prints" + num);
			num --;
		}
	}
	
	public Thread getT() {
		return t;
	}
	

}

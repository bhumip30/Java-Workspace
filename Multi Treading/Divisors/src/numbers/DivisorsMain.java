package numbers;

public class DivisorsMain {

	public static void main(String[] args) {
		Divisors d1 = new Divisors(32);
		Divisors d2 = new Divisors(54);
		Divisors d3 = new Divisors(65);
		
		System.out.println("Divisors writing start..");
		d1.getT().start();
		d2.getT().start();
		d3.getT().start();
		
		try {
			d1.getT().join();
			d2.getT().join();
			d3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Divisors writing end..");
	}

}

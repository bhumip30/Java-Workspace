package numbers;

public class PrimeNUmberThread extends Thread {
	int start, end;

	public PrimeNUmberThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		System.out.println("Prime Numbers: ");
		for(int n = start; n <= end; n++) {
			if(n < 2) {
				continue;
			}
			boolean prime = true;
			for(int i = 2; i < n; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println(n + " ");
			}
		}
	}
	
}

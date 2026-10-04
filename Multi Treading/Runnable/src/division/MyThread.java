package division;

public class MyThread {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for(int i=0; i<100; i++) {
				if(i % 3 == 0 || i % 5 == 0) {
					System.out.println(i);
				}
			}
			
		});
		
		t.start();

	}

}

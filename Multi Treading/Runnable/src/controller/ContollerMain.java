package controller;

public class ContollerMain {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.getT().start();
		
		for(int i=0; i<=5; i++ ) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

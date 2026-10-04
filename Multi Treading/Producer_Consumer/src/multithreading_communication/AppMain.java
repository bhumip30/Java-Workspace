package multithreading_communication;

public class AppMain {

	public static void main(String[] args) {
		Stocks s = new Stocks(); //shared resource
		
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.getT().start();
		c.getT().start();
		
		try {
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//To stop the process we can not directly implement stop();
		
		p.setbRun(false);
		c.setbRun(false);
		
		try {
			p.getT().join();
			c.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Alive Producer: " + p.getT().isAlive());
		System.out.println("Alive Consumer: " + c.getT().isAlive());
		
		System.out.println("Quantity Produced by Producer: " + s.getQtyProduced());
		System.out.println("Quantity Produced by Consumer: " + s.getQtyConsume());
	}

}

package syncdemo;

//printer
//printerjobs
public class ThreadSyncApp {

	public static void main(String[] args) {
		
		//shared resource
		Printer p = new Printer();

		//newly created state
		//depend on use of one common instance - p
		PrintingJob j1 = new PrintingJob(p, "(", "welcome to java", ")");
		PrintingJob j2 = new PrintingJob(p, "{", "Learning multithreading", "}");
		PrintingJob j3 = new PrintingJob(p, "[", "thread synchronization", "]");
		
		System.out.println("Printing job begins.....");
		//runnable
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		//main thread should wait till all the threads finish
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Printing job ends......");
		
	}

}



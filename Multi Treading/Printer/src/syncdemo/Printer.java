package syncdemo;

public class Printer {
	//shared resource
	
	public void print(String header, String body, String footer) {
		try {
				System.out.print(header);
				Thread.sleep(500);   //extending the task
				System.out.print(body);
				Thread.sleep(500);
				System.out.print(footer);
				System.out.println();
			}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			//synchronized block
			public void syncPrint(String header, String body, String footer) {
				synchronized(this) {     //object is locked
					try {
						System.out.print(header);
						Thread.sleep(500);   //extending the task
						System.out.print(body);
						Thread.sleep(500);
						System.out.print(footer);
						System.out.println();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}     //object's lock will be released
			}
			
			//synchronized method
			public synchronized void syncMethodprint(String header, String body, String footer) {
				try {
					System.out.print(header);
					Thread.sleep(500);   //extending the task
					System.out.print(body);
					Thread.sleep(500);
					System.out.print(footer);
					System.out.println();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}

}

package apps;

public class MyThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Name: " + t.getName());
		System.out.println("Priority: " + t.getPriority());
		

	}

}

package demo;

public class MyClassMain {

	public static void main(String[] args) {
		Runnable r = new MyClass();
		Thread t = new Thread(r);
		
		t.start();

	}

}

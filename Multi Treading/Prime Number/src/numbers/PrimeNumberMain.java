package numbers;

import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start: ");
		int start = sc.nextInt();
		
		System.out.println("Enter the end: ");
		int end = sc.nextInt();
		
		PrimeNUmberThread t = new PrimeNUmberThread(start, end);
		t.start();
		t.join();
	}

}

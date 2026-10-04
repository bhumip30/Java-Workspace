package int_operations;

import java.util.Scanner;

import operations.BasicIntOperations;
import operations.AdvIntOperations;
public class int_operation_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
	
		
		MyNumber no = new MyNumber();
		
		BasicIntOperations b = no;
		if (b.isEven(num))
			System.out.println("Number is even");
		
		if (b.isOdd(num))
			System.out.println("Number is odd");
		
		AdvIntOperations a = no;
		if (a.isPrime(num))
			System.out.println("The number is prime");
		else
			System.out.println("The number not prime");
		
		System.out.println("Factorial: "+(a.calFactorial(num)));
		
		sc.close();

	}

}

package operations;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the Array Size: ");
			int n = sc.nextInt();
			int [] arr = new int[n];
			
			System.out.println("Enter array elements: ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int index = sc.nextInt();
			System.out.println("Enter the array index: " + arr[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index");
		}
			
		catch (NegativeArraySizeException e) {
			System.out.println("Array size can not be negative");
		}
		
		sc.close();

	}

}

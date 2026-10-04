package array_operations;

public class arrayMain {

	public static void main(String[] args) {
		Integer [] arr = {34,42,6,53,67};
		
		ArrayOperation.print(arr);
		
		//ArrayOperation.search(arr, 67);
		
		System.out.println(ArrayOperation.search(arr, 67));
		
		System.out.println("Sorted Array: ");
				ArrayOperation.sort(arr);
	}

}

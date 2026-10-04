package array_operations;

import java.util.Arrays;

public class ArrayOperation <T> {

	public static <T> boolean search(T [] arr, T key) {
		boolean flag = false;
		for(T n : arr) {
			if (n.equals(key))
				flag = true;
		}
		return flag;
	}
	
	public static <T> void print(T [] arr) {
		for(T n : arr) {
			System.out.println(n);
		}
	}

	public static <T extends Comparable> void sort(T []arr) {
		Arrays.sort(arr);
		for(T n : arr) {
			System.out.println(n);
		}
	}

}

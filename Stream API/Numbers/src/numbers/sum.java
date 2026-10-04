package numbers;

import java.util.Arrays;
import java.util.List;

public class sum {

	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(51,15,12,84,23,45);
		int sum = numbers.stream()
				.mapToInt(Integer :: intValue)
				.sum();
		System.out.println(sum);

	}

}

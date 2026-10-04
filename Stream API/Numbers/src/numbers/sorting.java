package numbers;

import java.util.Arrays;
import java.util.List;

public class sorting {

	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(51,15,12,84,23,45);
		numbers.stream()
		.sorted()
		.forEach(System.out :: println);

	}

}

package numbers;

import java.util.Arrays;
import java.util.List;

public class Find_first {

	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(2,4,6,7,23,56,34);
		numbers.stream()
		.filter(n -> n > 5)
		.findFirst()
		.ifPresent(System.out :: println);

	}

}

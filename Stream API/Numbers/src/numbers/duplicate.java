package numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		List <Integer> numbers = Arrays.asList(1,3,4,5,3,1,5,6,8,768,7);
		Set <Integer> seen = new HashSet<>();
		numbers.stream()
		.filter(n -> !seen.add(n))
		.distinct()
		.forEach(System.out :: println);
		

	}

}

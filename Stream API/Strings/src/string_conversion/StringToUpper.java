package string_conversion;

import java.util.Arrays;
import java.util.List;

public class StringToUpper {

	public static void main(String[] args) {
		List <String> words = Arrays.asList("a", "b", "c");
		words.stream()
		.map(s -> s.toUpperCase())
		.forEach(System.out :: println);

	}

}

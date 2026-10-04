package string_conversion;

import java.util.Arrays;
import java.util.List;

public class TitleCase {

	public static void main(String[] args) {
		List <String> words = Arrays.asList("aarya", "bhumi");
		words.stream()
		.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
		.forEach(System.out :: println);

	}

}

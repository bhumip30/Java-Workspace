package string_conversion;

import java.util.Arrays;
import java.util.List;

public class LetterStart {

	public static void main(String[] args) {
		List <String> words = Arrays.asList("Aarya", "Aditi", "Rucha", "Sakshi", "Ayush");
		long count = words.stream()
				.filter(s -> s.startsWith("A"))
				.count();
		System.out.println("Count of words start with A: " + count);

	}

}

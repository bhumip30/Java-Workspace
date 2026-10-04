package string_conversion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class longestString {

	public static void main(String[] args) {
		List <String> words = Arrays.asList("Aarya", "Aditi", "Rucha", "Sakshi", "Ayush");
		String string = words.stream()
				.max(Comparator.comparingInt(String :: length))
				.get();
		System.out.println(string);
		

	}

}

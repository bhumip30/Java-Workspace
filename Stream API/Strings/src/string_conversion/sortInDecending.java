package string_conversion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortInDecending {

	public static void main(String[] args) {
		List <String> words = Arrays.asList("Aarya", "Aditi", "Rucha", "Sakshi", "Ayush");
		words.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out :: println);

	}

}

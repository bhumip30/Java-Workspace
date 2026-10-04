package evennumber;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		List <Integer> list = Arrays.asList(8,2,6,1,2,4,3,9);
		list.stream()
		.filter(n -> n%2 == 0)
		.forEach(System.out:: println);

	}

}

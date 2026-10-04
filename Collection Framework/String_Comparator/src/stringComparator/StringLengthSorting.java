package stringComparator;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringLengthSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set <String> set = new TreeSet<>((o1, o2)->{
			int diff = 0;
			diff = o1.length() - o2.length();
			if(diff != 0)
				return diff;
			return diff = o1.compareTo(o2);
		});
		
		set.add("extends");
		set.add("java");
		set.add("python");
		set.add("byte");
		set.add("catch");
		
		/*for (int i = 0; i < 5; i++) {
			set.add(sc.next());
		}*/
		
		System.out.println("Strings sorted by length then alphabetical:");
        set.forEach(System.out::println);
        sc.close();
        
		
	}
}

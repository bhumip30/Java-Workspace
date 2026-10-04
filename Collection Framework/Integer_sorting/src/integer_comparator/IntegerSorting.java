package integer_comparator;

import java.util.*;

public class IntegerSorting {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<Integer>(
            (a, b) -> b.compareTo(a)
        );

        set.add(50);
        set.add(20);
        set.add(80);
        set.add(10);
        set.add(40);

        System.out.println("Elements in descending order:");

        for (Integer n : set) {
            System.out.println(n);
        }
    }
}

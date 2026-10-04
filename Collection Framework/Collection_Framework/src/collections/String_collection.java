package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class String_collection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        List<String> list = new ArrayList<>();
        System.out.println("Enter the list elements (Strings): ");
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        System.out.println("Collection list: " + list);

        System.out.println("---------------------------");
        System.out.println("Collection size: " + list.size());

        System.out.println("---------------------------");
        for (String s : list)
            System.out.println(s);

        System.out.println("---------------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("---------------------------");
        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }

        System.out.println("---------------------------");
        list.forEach(s -> System.out.println(s));

        System.out.println("---------------------------");
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        System.out.println("---------------------------");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse order sorted list: " + list);

        System.out.println("---------------------------");
        if (list.contains("python"))
            System.out.println("Index of python is: " + list.indexOf("python"));

        System.out.println("---------------------------");
        System.out.println("Enter the index to remove: ");
        int index = sc.nextInt();
        list.remove(index);

        System.out.println("Collection list after removing: " + list);

        sc.close();
    }
}

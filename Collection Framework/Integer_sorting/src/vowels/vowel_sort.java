package vowels;

import java.util.Comparator;
import java.util.TreeSet;

public class vowel_sort {

    public static void main(String[] args) {
        Comparator<String> vowelComparator = (s1, s2) -> {
            int v1 = countVowels(s1);
            int v2 = countVowels(s2);

            if (v1 != v2) {
                return Integer.compare(v2, v1);
            } 
            return s1.compareTo(s2);
        };

        
        TreeSet<String> set = new TreeSet<>(vowelComparator);

       
        set.add("apple"); 
        set.add("banana"); 
        set.add("cherry");
        set.add("orange"); 
        set.add("sky"); 

        
        System.out.println(set);
    }

    private static int countVowels(String str) {
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (char ch : lowerStr.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

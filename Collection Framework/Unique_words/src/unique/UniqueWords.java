package unique;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;

public class UniqueWords {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("D:\\CDAC\\Myfiles\\story.txt"));
		
		HashSet<String> words = new HashSet<String>();
		String line;
		while((line = br.readLine()) != null) {
			String [] arr = line.split("\\s+");
			for(String word: arr) {
				word = word.toLowerCase();
				words.add(word);
			}
		}
		br.close();
		
		System.out.println("Unique Words: ");
		for(String word : words) {
			System.out.println(word);
		}
	}

}

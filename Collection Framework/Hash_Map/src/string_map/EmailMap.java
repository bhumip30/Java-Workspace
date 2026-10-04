package string_map;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmailMap {

	public static void main(String[] args) throws Exception {
		Map <String,Integer> str = new HashMap<>();
		
		Scanner sc = new Scanner(new File("D:\\CDAC\\Java Workspace\\Collection Framework\\Hash_Map\\emails.txt"));
		
		while (sc.hasNext()) {
			String email = sc.next();
			String domain = email.substring(email.indexOf("@") + 1);
			if(str.containsKey(domain)) {
				str.put(domain, str.get(domain) + 1);
			}else {
				str.put(domain, 1);
			}
		}
		
		System.out.println(str);
		sc.close();
		
	}

	
}

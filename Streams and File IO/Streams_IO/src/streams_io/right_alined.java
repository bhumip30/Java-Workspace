package streams_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class right_alined {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter file name: ");
	        String fname = br.readLine();

	        BufferedReader fr = new BufferedReader(new FileReader(fname));
	        List<String> lines = new ArrayList<>();
	        String line;
	        int maxLen = 0;

	        while ((line = fr.readLine()) != null) {
	            lines.add(line);
	            if (line.length() > maxLen) {
	                maxLen = line.length();
	            }
	        }

	        fr.close();

	        System.out.println("Right aligned contents:");
	        for (String l : lines) {
	            String replaced = l.replace(' ', '*');
	            System.out.printf("%" + maxLen + "s%n", replaced);
	        }

	}

}

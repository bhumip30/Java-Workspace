package streams_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Accept_setofchar {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("Write the quit for quiting the file");
			
		String line;
		String maxline = " ";
		int max = 0;
		while (!((line = br.readLine()).equals("quit"))) {
			System.out.println(line);
			if(max < line.length())
				max = line.length();
				maxline = line;
			}
		System.out.println(maxline);
		br.close();
		}
	

		
	}



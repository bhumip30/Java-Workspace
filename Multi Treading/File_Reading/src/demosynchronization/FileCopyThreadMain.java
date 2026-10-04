package demosynchronization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileCopyThreadMain {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter the path of source file: ");
		String source = br.readLine();
		
		System.out.println("Enter the path of destination file: ");
		String destination = br.readLine();
		
		FileCopyThread t = new FileCopyThread(source, destination);
		t.start();
		t.join();
		
		System.out.println("Main Thread Completed...");
	}

}

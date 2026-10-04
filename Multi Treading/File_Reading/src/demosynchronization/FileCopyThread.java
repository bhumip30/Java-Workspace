package demosynchronization;

import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyThread extends Thread {
	private String source;
	private String destination;
	
	public FileCopyThread(String source, String destination) {
		super();
		this.source = source;
		this.destination = destination;
	}
	
	public void run() {
		try {
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(destination);
			
			int ch;
			while((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			fr.close();
			fw.close();
			
			System.out.println("File read successfully...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

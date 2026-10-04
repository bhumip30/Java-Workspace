package streams_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class file_buffer {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file path");
		String path = br.readLine();
		
		File file = new File(path);
		System.out.println("Exists: " + file.exists());
		System.out.println("File: "+ file.isFile());
		System.out.println("Size: " + file.length());
		
		if(file.isDirectory()) {
			File [] files = file.listFiles();
			for (File f : files) {
				System.out.println(f.getName());
			}
		}
		
		if (file.length() > 25) {
			BufferedReader fr = new BufferedReader(new FileReader(path));
			String line;
			while ((line = fr.readLine()) != null)
				System.out.println(line);
		}
		else {
			FileReader frd = new FileReader(file);
			int ch;
			while ((ch = frd.read()) != -1)
				System.out.println((char) ch);
		}
		
		br.close();
		

	}

}

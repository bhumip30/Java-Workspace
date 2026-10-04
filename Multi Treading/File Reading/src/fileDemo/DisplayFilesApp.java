package fileDemo;

public class DisplayFilesApp {

	public static void main(String[] args) {
		DisplayFileData df1 = new DisplayFileData("D:\\CDAC\\Myfiles\\student.txt");
		DisplayFileData df2 = new DisplayFileData("D:\\CDAC\\Myfiles\\emp.txt");
		DisplayFileData df3 = new DisplayFileData("D:\\CDAC\\Myfiles\\source.txt");
		
		System.out.println("Display file data....");
		
		df1.getT().start();
		df2.getT().start();
		df3.getT().start();
		
		try {
			df1.getT().join();
			df2.getT().join();
			df3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Display file data end....");
	}

}

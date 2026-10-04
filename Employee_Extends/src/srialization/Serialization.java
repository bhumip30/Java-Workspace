package srialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import staff.Administrator;
import staff.Programmer;
import staff.SalesManager;
import utility.Employee;

public class Serialization {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\CDAC\\Myfiles\\emp.txt"));
		try {
		Employee [] allemps;
		allemps = new Employee[3];
		allemps[0] = new SalesManager(401, "Aarya", 900000.00, 1000.00, 100.00, null, 0);
		allemps[1] = new Programmer(201, "Ayush", 40000.00, "Transport Management", 5, 100.00,
				"AB101", 10);
		allemps[2] = new Administrator(902, "Shruti", 600034.00, 30000.00, 20000.00);
		
		for(Employee e : allemps) {
			oos.writeObject(e);
		}
				
		}
			
		
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		finally {
			oos.close();
		}


	}

}

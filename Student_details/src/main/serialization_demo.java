package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import student.Course;
import student.Date;
import student.Student;

public class serialization_demo {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\CDAC\\Myfiles\\student.txt"));
		try {
			Student [] std;
			std = new Student[3];
			
			std[0] = new Course("Aarya", new Date(30, 04, 2005), 2026101, "Advance Computing", 22, 101, "DAC", 1232432.00);
			std[1] = new Course("Bhumi", new Date(31, 01, 2020), 2026102, "Big Data", 7, 102, "DBDA", 50000.00);
			std[2] = new Course("Siddhesh", new Date(24, 05, 2004), 2026103, "Computer Science", 22, 103, "DCS", 150000.00);
			
			for(Student e : std) {
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

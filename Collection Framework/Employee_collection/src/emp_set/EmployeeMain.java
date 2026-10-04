package emp_set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		Set <Employee> emp = new TreeSet <> ((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		emp.add(new Employee(101, "Aarya", 30000.00f, "HR"));
		emp.add(new Employee(102, "Dhana", 342400.00f, "quality"));
		emp.add(new Employee(103, "Kajal", 12340.00f, "HR"));
		emp.add(new Employee(104, "Bhumi", 90000.00f, "Testing"));
		emp.add(new Employee(105, "Ayush", 56000.00f, "Project Management"));
		
		for (Employee e : emp) {
			System.out.println(e);
		}
		
	}
}
		
		
		
	

package student_set;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String city;
    private double percentage;

    public Student(int id, String name, String city, double percentage) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
               ", name=" + name +
               ", city=" + city +
               ", percentage=" + percentage + "]";
    }

    @Override
    public int hashCode() {
    	int code = 0;
        if (percentage >= 90) {
            code = 10;
        } else if (percentage >= 70) {
            code = 20;
        } else if (percentage >= 50) {
            code = 30; 
        } else if (percentage >= 35) {
            code = 40; 
        } else {
            code = 50;
        }
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if (obj instanceof Student) {
        	Student std = (Student)obj;
        	if(this.id == std.id && this.name.equals(std.name) && this.city.equals(std.city));
        		flag = true;
        
        }
		return flag;
    }
}

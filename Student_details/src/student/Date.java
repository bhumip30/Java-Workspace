package student;

import java.io.Serializable;

public class Date implements Serializable {
	int d, m, y;
	
	public Date(int dd, int mm, int yy) {
		this.d = dd;
		this.m = mm;
		this.y = yy;
	}
	
	public void display() {
		System.out.println("Date is: "+ d + "/" + m + "/" + y);
	}

}

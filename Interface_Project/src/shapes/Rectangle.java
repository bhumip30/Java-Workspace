package shapes;

import custom.Drawable;

public class Rectangle implements Drawable {
	double length, breadth;
	
	public Rectangle() {
	
	}
	
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void drawShapes() {
		// TODO Auto-generated method stub
		System.out.println("This is Rectangle");

	}

	@Override
	public  double calArea() {
		// TODO Auto-generated method stub
		return length*breadth;

	}

}

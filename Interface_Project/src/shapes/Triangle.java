package shapes;

import custom.Drawable;

public class Triangle implements Drawable {
	double base, height;
	
	
	public Triangle() {
		
	}
	
	public Triangle(double base, double height) {
		
		this.base = base;
		this.height = height;
	}

	@Override
	public void drawShapes() {
		// TODO Auto-generated method stub
		System.out.println("This is Triangle");

	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

}

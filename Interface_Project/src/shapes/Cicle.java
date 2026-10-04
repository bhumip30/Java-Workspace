package shapes;

import custom.Drawable;

public class Cicle implements Drawable {
	double radius;
	
	public Cicle() {
		super();
	}
	
	public Cicle(double radius) {
		this.radius = radius;
	}

	@Override
	public void drawShapes() {
		// TODO Auto-generated method stub
		System.out.println("This is Circle");

	}

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return PI * radius * radius;
	}

}

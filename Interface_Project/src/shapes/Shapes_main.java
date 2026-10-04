package shapes;
import custom.Drawable;

public class Shapes_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable [] shapes = new Drawable[3];
		
		shapes[0] = new Rectangle(4.5, 6.3);
		shapes[1] = new Cicle(4.5);
		shapes[2] = new Triangle(1.2, 6.7);
		
		for (Drawable d : shapes) {
			d.drawShapes();
			
			System.out.println("Area: " + d.calArea());
			
			System.out.println();
			
		}

	}

}

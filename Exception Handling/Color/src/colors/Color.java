package colors;

public class Color {
	private int red;
	private int blue;
	private int green;
	
	public Color(int red, int blue, int green) throws InvalidColorException{
		if (red < 0 || red > 255)
			throw new InvalidColorException("Invalid Red Argument");
		if(green < 0 || green > 255 )
			throw new InvalidColorException("Invalid Green Argument");
		if (blue < 0 || blue > 255)
			throw new InvalidColorException("Invalid Blue Argument");
		
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
	
	public void displayColor() {
		System.out.println("Red : " + red);
		System.out.println("Green : " + green);
        System.out.println("Blue : " + blue);
	}
	     
}

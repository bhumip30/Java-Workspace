package colors;

public class color_main {

	public static void main(String[] args) {
		try {

            Color c = new Color(255, 100, 200);

            c.displayColor();

        }
        catch (InvalidColorException e) {

            System.out.println(e.getMessage());
        }
		
		try {

            Color c = new Color(0, 100, 256);

            c.displayColor();

        }
        catch (InvalidColorException e) {

            System.out.println(e.getMessage());
        }

	}

}

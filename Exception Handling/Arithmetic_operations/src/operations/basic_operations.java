package operations;

public class basic_operations {

	public static void main(String[] args) {
		try {	
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			String operator = args[2];
			
			int result = 0;
			
			switch (operator) {
			case "+" :
				result = a + b;
				break;
			case "-" :
				result = a - b;
				break;
			case "*" :
				result = a * b;
				break;
			case "/" :
				if (b == 0)
					throw new ArithmeticException("Divisible by 0");
				result = a / b;
				break;
			default:
				System.out.println("Error: Invalid operator");
				return;
			}
			System.out.println("Result: " + result);
		}
			
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Please peovide 3 operators");
			}
			
			catch (NumberFormatException e) {
				System.out.println("First two arguments are numbers");
			}
			
			catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

	}

}

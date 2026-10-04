package calculator_main;

import calculator.ScientificCalculator;
import calculator.SimpleCalculator;

public class cal_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalculator sc = new SimpleCalculator();
		
		System.out.println("Addition: " + sc.add(4, 5));
		System.out.println("Addition: " + sc.substract(56, 53));
		System.out.println("Addition: " + sc.multiplication(4, 5));
		System.out.println("Addition: " + sc.division(14, 7));
		
		System.out.println("ScientificCalculator: ");
		
		ScientificCalculator Sci = new ScientificCalculator();
		System.out.println("Addition: " +Sci.add(4, 5));
		System.out.println("Addition: " + Sci.substract(56, 53));
		System.out.println("Addition: " + Sci.multiplication(4, 5));
		System.out.println("Addition: " + Sci.division(14, 7));
		System.out.println("Sin: " + Sci.sin(90));
		System.out.println("Cos: " + Sci.cos(100));
		System.out.println("Tan: " + Sci.tan(120));
	}

}

package calculator;

import custom.calculator;

public class SimpleCalculator implements calculator {

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double substract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double division(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}

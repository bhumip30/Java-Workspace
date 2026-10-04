package calculator;

import custom.iScientificCalculator;

public class ScientificCalculator implements iScientificCalculator {

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

	@Override
	public double sin(double angle) {
		// TODO Auto-generated method stub
		return Math.sin(Math.toRadians(angle));
	}

	@Override
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return Math.cos(Math.toRadians(angle));
	}

	@Override
	public double tan(double angle) {
		// TODO Auto-generated method stub
		return Math.tan(Math.toRadians(angle));
	}

}

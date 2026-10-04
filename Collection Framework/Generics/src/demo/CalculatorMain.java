package demo;

import util.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator <Integer> c1 = new Calculator<>(10, 11);
		System.out.println(c1.add());

		Calculator <Double> c2 = new Calculator<>(10.23, 34.09);
		System.out.println(c2.add());
	}

}

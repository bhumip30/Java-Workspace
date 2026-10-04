package util;

public class Calculator <T extends Number> {
	T no1;
	T no2;
	
	public Calculator (T no1, T no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public double add() {
		return no1.doubleValue() + no2.doubleValue();
	}
}

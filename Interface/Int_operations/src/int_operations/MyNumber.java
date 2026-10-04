package int_operations;

import operations.AdvIntOperations;
import operations.BasicIntOperations;

public class MyNumber implements BasicIntOperations, AdvIntOperations {
	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return num  % 2 != 0;
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		return num % 2 == 0;
	}
	
	@Override
	public boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++)
			return false;
	
		return true;
	}

	@Override
	public double calFactorial(int num) {
		// TODO Auto-generated method stub
		double fact = 1;
		for (int i = 1; i < num; i++)
			fact = fact * i;
		return fact;
	}

}

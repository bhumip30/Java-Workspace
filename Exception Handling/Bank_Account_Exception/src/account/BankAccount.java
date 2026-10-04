package account;

public class BankAccount {
	private int AccNo;
	private String AccHolder;
	private double balence;
	public BankAccount() {
		super();
	}
	
	public BankAccount(int accNo, String accHolder, double balence) {
		super();
		AccNo = accNo;
		AccHolder = accHolder;
		this.balence = balence;
	} 

	public void deposite (double amount) {
		if (amount < 0)
			throw new IllegalArgumentException("Invalid deposite amount");
			balence = balence + amount;
	}
	
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid withdrawal amount");
		}
		if (amount > balence) {
			throw new ArithmeticException("Insufficient Balence");
		}
		
		balence = balence - amount;
	}
	
	public void display() {
		System.out.println("Account Number: " + AccNo);
		System.out.println("Account Holder: " + AccHolder);
		System.out.println("Account Balence: " + balence);
	}

}

package account;

public class SavingsAccount extends Account {
	static double interestRate = 5;
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(int accno, String name, double balance) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
		
	}
	
	public void withdraw(double amt) {

        if (balance - amt >= 1000) {
            balance = balance - amt;
            System.out.println("Amount withdrawn : " + amt);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance Rs.1000 required.");
        }
    }
	
	 public double calBalance() {
	        double interest = balance * interestRate / 100;
	        return balance + interest;
	    }

	    // Display
	    public void display() {
	        System.out.println("----- Savings Account -----");
	        super.display();
	        System.out.println("Interest Rate : " + interestRate + "%");
	    }

}

package account;

public class Account {
	 protected int accno;
	    protected String name;
	    protected double balance;

	    public Account() {
	        accno = 0;
	        name = "Unknown";
	        balance = 0;
	    }

	    public Account(int accno, String name, double balance) {
	        this.accno = accno;
	        this.name = name;
	        this.balance = balance;
	    }

	    public void withdraw(double amt) {
	    }

	    public double calBalance() {
	        return balance;
	    }

	    public void display() {
	        System.out.println("Account No : " + accno);
	        System.out.println("Name       : " + name);
	        System.out.println("Balance    : " + calBalance());
	    }
}

package account;

public class RecurringAccount extends Account {
	 private double installmentAmt;
	 private int noOfInstallments;
	 static double interestRate = 6;
	public RecurringAccount() {
		// TODO Auto-generated constructor stub
		
	}

	public RecurringAccount(int accno, String name, double balance,double installmentAmt, int noOfInstallments) {
		super(accno, name, balance);
		// TODO Auto-generated constructor stub
		 this.installmentAmt = installmentAmt;
	     this.noOfInstallments = noOfInstallments;
	}
	
	public void withdraw(double amt) {
        System.out.println("Withdrawal is not allowed from Recurring Account.");
    }

    public double calBalance() {

        double total = balance +
                (installmentAmt * noOfInstallments);

        double interest = total * interestRate / 100;

        return total + interest;
    }

    public void display() {
        System.out.println("----- Recurring Account -----");
        super.display();

        System.out.println("Installment Amount : " + installmentAmt);
        System.out.println("No. of Installments : " + noOfInstallments);
        System.out.println("Interest Rate : " + interestRate + "%");
    }

}

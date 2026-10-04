package account;

public class Bank_Account_main {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(100001, "Aarya", 5000000);
		try {
			b.deposite(2000);
			System.out.println("Deposite Succesful");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b.deposite(-45443);
			System.out.println("Deposite Unsuccesful");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b.withdraw(3000);
			System.out.println("Withdraw Succesful");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			b.withdraw(-34444);
			System.out.println("Withdraw Unsuccesful");
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		b.display();
	}

}

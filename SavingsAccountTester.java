package lab01;

public class SavingsAccountTester {

	public static void main(String[] args) {
		// Create a new savings account with $1000.00 at a 5% interest rate
		SavingsAccount acct1 = new SavingsAccount(1000.00,0.05);
		acct1.addInterest(); // A year passes... accumulate interest
		acct1.deposit(500.00); // You won the lottery! Save another $500.00
		acct1.addInterest(); // Another year passes
		acct1.withdraw(800.00); // You just had to have that new I-Phone!
		acct1.addInterest(); // Another year passes
		System.out.println("Your account has " + acct1.getBalance() + " dollars.");
	}

}

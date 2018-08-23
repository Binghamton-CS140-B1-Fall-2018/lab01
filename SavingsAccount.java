/**
 *
 */
package lab01;

/**
 * @author Thomas
 *
 */
public class SavingsAccount {

	/**
	 * SavingsAccount class to represent a bank savings account
	 * Model a savings account with two fields:
	 * 	- Balance - the amount of money in the account
	 *  - Interest - the percent interest earned in one year
	 */

	double balance;
	double interest;

	/**
	 * Create a new savings account
	 * @param balance
	 * @param interest
	 */
	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}

	/**
	 * deposit more money into the savings account
	 * @param depositAmount
	 */
	public void deposit(double depositAmount) {
		// TODO : add the depositAmount to the balance, and save the
		//     		result in the balance field
	}

	/**
	 * Assuming a year has passed, add the annual interest to the account
	 */
	public void addInterest() {
		balance = balance + (interest * balance);
	}

	/**
	 * withdraw money from the savings account
	 * 		Note that if there is not enough money in the account
	 * 		to make the requested withdrawal, the bank will deny the
	 * 		withdrawal request and tell the user that he does not have
	 * 		enough money to withdraw that amount ("Insufficient funds")
	 * @param withdrawAmount
	 */
	public void withdraw(double withdrawAmount) {
		// TODO : check to make sure there is enough money in the balance
		//            of this account to make the requested withdrawal.
		//            If there is not enough, do not change the balance, but
		//            print the following message:
		//					System.out.println("Insufficient funds");
		//				If there is enough, subtract that amount from the balance.
	}

	/**
	 * get the current balance in the account
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * get the current interest rate on this account
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}
}

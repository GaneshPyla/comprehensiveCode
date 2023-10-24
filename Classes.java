package com.qa.test;

class Account {
	protected double balance;
	protected double interestRate;

	public Account(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
	}
}

class SavingsAccount extends Account {
	public SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}

	@Override
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
	}
}

class CurrentAccount extends Account {
	public CurrentAccount(double balance, double interestRate) {
		super(balance, interestRate);
	}

	@Override
	public void calculateInterest() {
		System.out.println("Interest not applicable for current acc");
	}
}

public class Classes {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount(1500, 5);
		CurrentAccount currentAccount = new CurrentAccount(2000, 2);

		System.out.println("Initial Savings Account Balance: " + savingsAccount.balance);
		System.out.println("Initial Current Account Balance: " + currentAccount.balance);

		savingsAccount.calculateInterest();
		currentAccount.calculateInterest();

		System.out.println("Savings Account Balance after Interest: " + savingsAccount.balance);
		System.out.println("Current Account Balance after Interest: " + currentAccount.balance);
	}

}

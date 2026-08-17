package entities;

public class Holder {
	private String name;
	private int accountNumber;
	private double balance;

	public Holder() {

	}

	public Holder(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public Holder(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getInitialBalance() {
		return balance;
	}

	public void setInitialBalance(double balance) {
		this.balance = balance;
	}

	public void initialDeposit(double initialDeposit) {
		this.balance += initialDeposit;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}

	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5;
	}
}
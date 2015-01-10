package uk.co.keithsjohnson.accounts.model;

public class Account {
	private final String name;

	private final long balance;

	public Account(String name, long balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + "]";
	}

}

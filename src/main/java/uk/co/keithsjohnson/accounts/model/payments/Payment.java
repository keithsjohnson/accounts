package uk.co.keithsjohnson.accounts.model.payments;

import java.time.LocalDate;

import uk.co.keithsjohnson.accounts.model.accounts.Account;

public class Payment {

	private final LocalDate dueDate;

	private final String payee;

	private final Account account;

	private final long amount;

	public Payment(LocalDate dueDate, String payee, Account account, long amount) {
		super();
		this.dueDate = dueDate;
		this.payee = payee;
		this.account = account;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public String getPayee() {
		return payee;
	}

	public Account getAccount() {
		return account;
	}

	public long getAmount() {
		return amount;
	}

}

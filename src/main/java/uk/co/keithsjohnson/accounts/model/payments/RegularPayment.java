package uk.co.keithsjohnson.accounts.model.payments;

import java.time.LocalDate;

import uk.co.keithsjohnson.accounts.model.accounts.Account;

public class RegularPayment {

	private final LocalDate dueDate;

	private final String payee;

	private final Account account;

	private final long amount;

	private final PaymentFrequency paymentFrequency;

	private final String memo;

	public RegularPayment(LocalDate dueDate, String payee, Account account, long amount, PaymentFrequency paymentFrequency, String memo) {
		super();
		this.dueDate = dueDate;
		this.payee = payee;
		this.account = account;
		this.amount = amount;
		this.paymentFrequency = paymentFrequency;
		this.memo = memo;
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

	public PaymentFrequency getPaymentFrequency() {
		return paymentFrequency;
	}

	public String getMemo() {
		return memo;
	}
}

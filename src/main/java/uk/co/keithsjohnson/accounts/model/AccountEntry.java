package uk.co.keithsjohnson.accounts.model;

import java.time.LocalDate;

public class AccountEntry {
	private final LocalDate date;
	private final String payee;
	private final ReconciliationType reconciliationType;
	private final long amount;
	private final AmountType amountType;

	public AccountEntry(LocalDate date, String payee, long amount, AmountType amountType) {
		this.date = date;
		this.payee = payee;
		this.reconciliationType = ReconciliationType.UNRECONCILED;
		this.amount = amount;
		this.amountType = amountType;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getPayee() {
		return payee;
	}

	public ReconciliationType getReconciliationType() {
		return reconciliationType;
	}

	public long getAmount() {
		return amount;
	}

	public AmountType getAmountType() {
		return amountType;
	}

}

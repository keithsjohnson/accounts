package uk.co.keithsjohnson.accounts.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import uk.co.keithsjohnson.accounts.model.Account;

@Service
public class AccountsRetreiver {

	public List<Account> getAccounts() {
		List<Account> accounts = new ArrayList<>();
		Account account = new Account("Current", 0);
		accounts.add(account);
		Account account2 = new Account("Savings", 10);
		accounts.add(account2);
		return accounts;
	}

}

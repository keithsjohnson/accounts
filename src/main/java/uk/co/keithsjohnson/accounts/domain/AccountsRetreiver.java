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
		return accounts;
	}

}

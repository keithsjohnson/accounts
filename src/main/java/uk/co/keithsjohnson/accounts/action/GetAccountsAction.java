package uk.co.keithsjohnson.accounts.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uk.co.keithsjohnson.accounts.domain.AccountsRetreiver;
import uk.co.keithsjohnson.accounts.model.Account;

@Controller
public class GetAccountsAction {

	private final AccountsRetreiver accountsRetriever;

	@Autowired
	public GetAccountsAction(AccountsRetreiver accountsRetriever) {
		this.accountsRetriever = accountsRetriever;
	}

	public List<Account> getAccounts() {
		return accountsRetriever.getAccounts();
	}

}
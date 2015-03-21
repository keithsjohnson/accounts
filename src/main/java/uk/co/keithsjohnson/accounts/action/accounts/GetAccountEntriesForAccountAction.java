package uk.co.keithsjohnson.accounts.action.accounts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import uk.co.keithsjohnson.accounts.domain.accounts.AccountEntriesRetriever;
import uk.co.keithsjohnson.accounts.model.accounts.Account;
import uk.co.keithsjohnson.accounts.model.accounts.AccountEntry;

@Controller
public class GetAccountEntriesForAccountAction {
	private final AccountEntriesRetriever accountEntriesRetriever;

	@Autowired
	public GetAccountEntriesForAccountAction(AccountEntriesRetriever accountEntriesRetriever) {
		this.accountEntriesRetriever = accountEntriesRetriever;
	}

	public List<AccountEntry> getAccountEntriesForAccount(Account account) {
		return accountEntriesRetriever.getAccountEntriesForAccount(account);
	}

}

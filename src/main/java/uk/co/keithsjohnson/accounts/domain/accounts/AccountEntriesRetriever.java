package uk.co.keithsjohnson.accounts.domain.accounts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import uk.co.keithsjohnson.accounts.model.AmountType;
import uk.co.keithsjohnson.accounts.model.accounts.Account;
import uk.co.keithsjohnson.accounts.model.accounts.AccountEntry;

@Service
public class AccountEntriesRetriever {

	public List<AccountEntry> getAccountEntriesForAccount(Account account) {
		List<AccountEntry> accountEntries = new ArrayList<>();
		AccountEntry accountEntry1 = new AccountEntry(LocalDate.now(), "Mortgage", 42556, AmountType.DEBIT);
		accountEntries.add(accountEntry1);
		AccountEntry accountEntry2 = new AccountEntry(LocalDate.now(), "TV Licence", 1212, AmountType.DEBIT);
		accountEntries.add(accountEntry2);
		return accountEntries;

	}
}

package uk.co.keithsjohnson.accounts.action.accounts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import uk.co.keithsjohnson.accounts.domain.accounts.AccountEntriesRetriever;
import uk.co.keithsjohnson.accounts.model.Account;
import uk.co.keithsjohnson.accounts.model.AccountEntry;

@RunWith(MockitoJUnitRunner.class)
public class GetAccountEntriesActionJUnitTest {

	@InjectMocks
	private GetAccountEntriesForAccountAction testSubject;

	@Mock
	private AccountEntriesRetriever mockAccountEntriesRetriever;

	@Test
	public void shouldGetAccounts() {
		// Given
		Account account = new Account("", 0);
		List<AccountEntry> accountEntries = new ArrayList<>();
		when(mockAccountEntriesRetriever.getAccountEntriesForAccount(account)).thenReturn(accountEntries);

		// When
		List<AccountEntry> returnAccountEntries = testSubject.getAccountEntriesForAccount(account);

		// Then
		assertNotNull(returnAccountEntries);
		assertEquals(accountEntries, returnAccountEntries);
	}
}

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

import uk.co.keithsjohnson.accounts.domain.accounts.AccountsRetreiver;
import uk.co.keithsjohnson.accounts.model.accounts.Account;

@RunWith(MockitoJUnitRunner.class)
public class GetAccountsActionJUnitTest {

	@InjectMocks
	private GetAccountsAction testSubject;

	@Mock
	private AccountsRetreiver mockAccountsRetreiver;

	@Test
	public void shouldGetAccounts() {
		// Given
		List<Account> accounts = new ArrayList<>();
		when(mockAccountsRetreiver.getAccountsForUser()).thenReturn(accounts);

		// When
		List<Account> returnAccounts = testSubject.getAccounts();

		// Then
		assertNotNull(returnAccounts);
		assertEquals(accounts, returnAccounts);
	}
}
